package org.geekmozo.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SecondServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<h1> It's a Generic Servlet....</h1>");
        pw.println("<h4 style=\"color:red\">" + new Date().toString() +"</h1>");
    }
}
