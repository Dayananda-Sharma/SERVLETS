package com.xworkz.bankloan.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/bank",loadOnStartup = 1)
public class Bank extends GenericServlet {
    public Bank(){
        System.out.println("object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");

        String num=servletRequest.getParameter("num");
        System.out.println("Aadhaar number=="+num);

        String number=servletRequest.getParameter("number");
        System.out.println("verify=="+number);

        String i=servletRequest.getParameter("I");
        System.out.println("ID Type=="+i);

        String d=servletRequest.getParameter("D");
        System.out.println("ID number=="+d);

        String n=servletRequest.getParameter("n");
        System.out.println("Enter your Name=="+n);

        String a=servletRequest.getParameter("a");
        System.out.println("Enter another Name=="+a);

        String m=servletRequest.getParameter("m");
        System.out.println("Enter Father your Name=="+m);

        String e=servletRequest.getParameter("e");
        System.out.println("Enter your Name=="+e);
    }
}
