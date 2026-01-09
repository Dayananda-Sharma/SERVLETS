package com.xworkz.netfix.servlet;

import com.xworkz.netfix.NetflixService.NetflixService;
import com.xworkz.netfix.dto.NetflixDto;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/net",loadOnStartup = 1)
public class Netflix extends GenericServlet {
    public Netflix(){
        System.out.println("object created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method called...");


        String name=servletRequest.getParameter("name");
        System.out.println("UserName=="+name);

        long num= Long.parseLong(servletRequest.getParameter("num"));
        System.out.println("Enter your Number=="+num);

        int otp=Integer.parseInt(servletRequest.getParameter("otp"));
        System.out.println("Enter your OTP=="+otp);

        String i=servletRequest.getParameter("I");
        System.out.println("Enter your IDType=="+i);

        long d=Long.parseLong(servletRequest.getParameter("D"));
        System.out.println("Enter your IDNumber=="+d);

        NetflixDto netflixDto=new NetflixDto(name,num,otp,i,d);
        NetflixService netflixService=new NetflixService();
        boolean isValidation=netflixService.validation(netflixDto);

        PrintWriter printWriter=servletResponse.getWriter();
        if (isValidation){
            printWriter.println("hi"+name);
            printWriter.println("Registration completed...");
        }else {
            printWriter.println("invalid data...");
        }

    }
}
