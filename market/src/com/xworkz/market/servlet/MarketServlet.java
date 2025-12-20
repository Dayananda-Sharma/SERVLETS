package com.xworkz.market.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/market",loadOnStartup = 1)
public class MarketServlet extends GenericServlet {
    public MarketServlet(){
        System.out.println("object created");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("initialized method called...");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service activated");
    }

}
