package org.geekmozo.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        String name = req.getParameter("name");
        pw.println("Welcome " + name);
        pw.println("<h3><a href='servlet2'> Go To Servlet Two </a></h3>");

//        creating cookie
        Cookie c = new Cookie("uname",name);
        resp.addCookie(c);

    }
}
