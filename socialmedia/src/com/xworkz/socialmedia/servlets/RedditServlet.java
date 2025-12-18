package com.xworkz.socialmedia.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/red",loadOnStartup = 7)
public class RedditServlet extends GenericServlet {
    public RedditServlet(){
        System.out.println("red object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
