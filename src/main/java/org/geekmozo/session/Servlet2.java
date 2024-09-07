package org.geekmozo.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // getting all the cookies passed from servlet1

        Cookie[] cookies = req.getCookies();
        boolean f = false;
        String name="";
        System.out.println(cookies[0].getName());
        if(cookies == null){
            pw.println("<h1>You are new user go to home page and submit your name</h1>");
            return;
        }else {
            for (Cookie c:cookies) {
                String tname = c.getName();
                if(tname.equals("uname")){
                    f = true;
                    name = c.getValue();
                }
            }
        }

        if(f) {
            pw.println("Welcome " + name);
            pw.println("<h3>Welcome to Geekmozo.</h3>");
        }else {
            pw.println("<h1>You are new user go to home page and submit your name</h1>");
        }
    }
}
