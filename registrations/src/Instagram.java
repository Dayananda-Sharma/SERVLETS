import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/insta",loadOnStartup = 1)
public class Instagram extends GenericServlet {
    public Instagram(){
        System.out.println("object created");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("userName");
        System.out.println("User name=="+name);

        String password=servletRequest.getParameter("password");
        System.out.println("password=="+password);

        String Confirm=servletRequest.getParameter("password");
        System.out.println("Enter again=="+Confirm);

        String num=servletRequest.getParameter("number");
        System.out.println("Enter your Number=="+num);

        String date=servletRequest.getParameter("date");
        System.out.println("Enter Your Date of birth=="+date);
    }
}
