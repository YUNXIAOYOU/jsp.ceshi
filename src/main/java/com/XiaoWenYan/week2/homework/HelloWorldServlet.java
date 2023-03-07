package com.XiaoWenYan.week2.homework;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//now its just a java class
//extend HttpServlet
public class HelloWorldServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //when client request method is GET - here - inside doGet()
        //we want to send Hello to client
        //we need to write Hello in response
        //get writer - java.io
        PrintWriter writer = response.getWriter();
        writer.println("Name:XiaoWenYan\n" +
                "ID:2021211001000917\n" +
                "Date and Time Tue Mar 7 19:19 CST 2023");//that all
        //next we need to tell about this servlet to tomcat - how ? - web.xml

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        //when client request method is POST - here - inside doPost()

    }
}
