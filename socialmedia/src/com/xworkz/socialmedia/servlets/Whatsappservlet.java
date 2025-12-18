package com.xworkz.socialmedia.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/app",loadOnStartup = 8)
public class Whatsappservlet extends GenericServlet {
    public Whatsappservlet(){
        System.out.println("whatsapp object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
