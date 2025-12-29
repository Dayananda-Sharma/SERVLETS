package com.xworkz.netfix.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/net",loadOnStartup = 1)
public class Netflix extends GenericServlet {
    public Netflix(){
        System.out.println("object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");


        String name=servletRequest.getParameter("name");
        System.out.println("UserName=="+name);

        String num=servletRequest.getParameter("num");
        System.out.println("Enter your Number=="+num);

        String otp=servletRequest.getParameter("otp");
        System.out.println("Enter your OTP=="+otp);

        String i=servletRequest.getParameter("I");
        System.out.println("Enter your IDType=="+i);

        String d=servletRequest.getParameter("D");
        System.out.println("Enter your IDNumber=="+d);


        PrintWriter printWriter=servletResponse.getWriter();
        printWriter.println("Hi..."+name);
        printWriter.println("You are Successfully Registered..");
    }
}
