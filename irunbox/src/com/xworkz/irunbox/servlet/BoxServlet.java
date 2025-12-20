package com.xworkz.irunbox.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/box",loadOnStartup = 2)
public class BoxServlet extends GenericServlet {
    public BoxServlet(){
        System.out.println("object created...");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("initialized method created...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service called..");
    }
}
