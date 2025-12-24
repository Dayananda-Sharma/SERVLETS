package com.xworkz.coke.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/coke",loadOnStartup = 1)
public class Coke extends GenericServlet {
    public Coke(){
        System.out.println("object created");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initialized method created...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy the method ");
    }
}
