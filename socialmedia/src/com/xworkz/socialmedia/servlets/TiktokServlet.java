package com.xworkz.socialmedia.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/tiktok",loadOnStartup = 3)
public class TiktokServlet extends GenericServlet {
    public TiktokServlet(){
        System.out.println("tik object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
