package com.xworkz.vivo.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/vivo",loadOnStartup = 10)
public class VivoServlet extends GenericServlet {
    public VivoServlet(){
        System.out.println("object created");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("initialized called...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service called...");
    }
}
