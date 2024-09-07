package org.geekmozo.urlwriting;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("user");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<h1 style=\"color:red\">Your name is: " + name + "</h1>");

    }
}
