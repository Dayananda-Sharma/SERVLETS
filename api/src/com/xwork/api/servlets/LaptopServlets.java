package com.xwork.api.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/lap",loadOnStartup = 3)
public class LaptopServlets extends GenericServlet {
       public LaptopServlets(){
           System.out.println("laptop object created");
       }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
