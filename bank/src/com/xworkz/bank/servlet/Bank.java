package com.xworkz.bank.servlet;

import com.xworkz.bank.Service.BankService;
import com.xworkz.bank.dto.BankDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/bank",loadOnStartup = 1)
public class Bank extends HttpServlet {
    public Bank(){
        System.out.println("object created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is get method");

        Long number= Long.parseLong(req.getParameter("number"));
        System.out.println(number);
        String type= req.getParameter(req.getParameter("I"));
        System.out.println(type);
        Long num=Long.parseLong(req.getParameter("D"));
        System.out.println(num);
        String name=req.getParameter("n");
        System.out.println(name);

        BankDto bankDto=new BankDto(number,type,num,name);
        BankService bankService=new BankService();
         boolean isvalidation =bankService.validation(bankDto);

        PrintWriter printWriter =resp.getWriter();

        if (isvalidation){
            printWriter.println("Hii"+name);
            printWriter.println("Bank account created");
        }else {
            printWriter.println("invalid data");
        }

    }

}
