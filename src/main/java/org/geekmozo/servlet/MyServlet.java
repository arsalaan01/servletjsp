package org.geekmozo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET method is called . . . . . .");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h2>GET method is called from servlet </h2>");
        printWriter.println(LocalDate.now().getMonth());
    }
}
