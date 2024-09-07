package org.geekmozo.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static java.lang.System.out;

public class FirstServlet implements Servlet {

    // Lifecycle methods

    ServletConfig servletConfig;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
        out.println("Creating Object ..... ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        out.println("Servlet is serving for us...");
//        set the content type of response
        servletResponse.setContentType("text/html");
        PrintWriter pw = servletResponse.getWriter();
        pw.println("<h1 style=\"color:green\">Hello from First Servlet </h1>");
        pw.println("<h1 style=\"color:red\">"+ new Date().toString()+ "</h1>");

    }

    @Override
    public String getServletInfo() {
        return "servlet is created by Ali";
    }

    @Override
    public void destroy() {
        out.println("Sevlet is getting destroyed");
    }
}
