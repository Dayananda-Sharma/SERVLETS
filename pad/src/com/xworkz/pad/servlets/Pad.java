package com.xworkz.pad.servlets;

import com.xworkz.pad.dto.PadDto;
import com.xworkz.pad.service.PadService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/pad",loadOnStartup = 1)
public class Pad extends HttpServlet {
    public Pad(){
        System.out.println("object created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post method");

        String name=req.getParameter("name");
        System.out.println(name);
        String location=req.getParameter("location");
        System.out.println(location);

        PadDto padDto =new PadDto(name,location);
        PadService padService=new PadService();
        boolean isvalidation =padService.validation(padDto);

        PrintWriter printWriter =resp.getWriter();

        if (isvalidation){
            printWriter.println("Hii"+name);
            printWriter.println("register successful");
        }else {
            printWriter.println("invalid data");
        }
    }
}
