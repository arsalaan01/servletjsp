package org.geekmozo.attribute;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class S1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int n1 = Integer.parseInt(req.getParameter("n1"));
        int n2 = Integer.parseInt(req.getParameter("n2"));

        int sum = n1 + n2;

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        req.setAttribute("sum",sum);

        RequestDispatcher rd = req.getRequestDispatcher("s2");
        rd.forward(req,resp);

    }
}
