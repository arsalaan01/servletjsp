package org.geekmozo.urlwriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class URLWriting extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1>Your name is: " + name + "</h1>");
        printWriter.println("<a href='newservlet?user="+name+"'>Go To Second Servlet</a>");
    }
}
