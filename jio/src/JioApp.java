import com.xworkz.jio.dto.JioDto;
import com.xworkz.jio.service.JioService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/jio",loadOnStartup = 1)
public class JioApp extends GenericServlet {
    public JioApp(){
        System.out.println("object created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");

        String name=servletRequest.getParameter("name");
        System.out.println("your name=="+name);

        Long num=Long.parseLong(servletRequest.getParameter("num"));
        System.out.println("number=="+num);

        Integer otp =Integer.parseInt(servletRequest.getParameter("otp"));
        System.out.println("your otp=="+otp);

        JioDto jioDto=new JioDto(name,num,otp);
        JioService jioService=new JioService();
        boolean isValidation =jioService.validation(jioDto);


        PrintWriter printWriter=servletResponse.getWriter();

        if (isValidation){
       printWriter.println("Hii"+name);
       printWriter.println("Register successful");
   }else {
       printWriter.println("invalid data");
   }
    }
}
