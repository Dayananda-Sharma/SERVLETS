package com.xworkz.register.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/facebook",loadOnStartup = 1)
public class Facebook extends GenericServlet {
    public Facebook(){
        System.out.println("object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");

        String name=servletRequest.getParameter("name");
        System.out.println("UserName=="+name);

        String pass=servletRequest.getParameter("password");
        System.out.println("Password=="+pass);

        String again=servletRequest.getParameter("confirm");
        System.out.println("Confirm Password"+again);

        String num=servletRequest.getParameter("number");
        System.out.println("PhoneNumber=="+name);

        String male=servletRequest.getParameter("kk");
        System.out.println(male);
        
        String Female=servletRequest.getParameter("kk");
        System.out.println(Female);
    }
}
