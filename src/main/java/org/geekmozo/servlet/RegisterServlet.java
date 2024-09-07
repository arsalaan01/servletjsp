package org.geekmozo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome to register servlet.</h2>");
        String name = req.getParameter("uname");
        String password = req.getParameter("upass");
        String email = req.getParameter("uemail");
        String gender = req.getParameter("ugender");
        String course = req.getParameter("ucourse");
        String con = req.getParameter("ucon");

        if(con != null && con.equals("checked"))
        {
         out.println("<h2>Name : " +name+"</h2>");
         out.println("<h2>Password : " +password+"</h2>");
         out.println("<h2>Email : " +email+"</h2>");
         out.println("<h2>Gender : " +gender+"</h2>");
         out.println("<h2>Course : " +course+"</h2>");

         // save to db

         // forward to success servlet using request dispatcher
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("success");
            requestDispatcher.forward(req,resp);

        }else {
            out.println("<h2>You have not accepted terms and condtions</h2>");
//          including output of register.jsp
//          getting obj of RequestDispatcher
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
            requestDispatcher.include(req,resp);
        }

    }
}
