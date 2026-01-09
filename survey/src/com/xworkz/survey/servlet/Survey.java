package com.xworkz.survey.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/survey",loadOnStartup = 1)
public class Survey extends HttpServlet {
    public Survey(){
        System.out.println("object created");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String registration= req.getParameter("registration");
       String user= req.getParameter("user");
       String age= req.getParameter("age");
       String email= req.getParameter("email");
       String location= req.getParameter("location");
       String newpassword= req.getParameter("newpassword");
       String confrimnewpassword= req.getParameter("password");
       String check= req.getParameter("check");

        System.out.println("Registration=="+registration);
        System.out.println("user name=="+user);
        System.out.println("age=="+age);
        System.out.println("email=="+email);
        System.out.println("location=="+location);
        System.out.println("newpassword=="+newpassword);
        System.out.println("confirm password=="+confrimnewpassword);
        System.out.println("is check=="+check);

        PrintWriter printWriter =resp.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<tittle>");
        printWriter.println("</tittle>");
        printWriter.println("<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css' rel='stylesheet'>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("Hii   "+user);
        printWriter.println("<Span class='link-success'>your successful register</Span>");
        printWriter.println("</body>");
        printWriter.println("</html>");

    }
}
