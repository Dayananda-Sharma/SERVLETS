package com.xworkz.supermarket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/mart",loadOnStartup = 1)
public class Market extends GenericServlet {
    public Market(){
        System.out.println("object created");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println(" initlized method called ");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println(" service method called");
    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("destroy the method");
    }
}
