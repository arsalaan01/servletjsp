package org.geekmozo.register;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getting all the details from incomming  request.
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        try {
            Thread.sleep(1000);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb","root","Arena#123");
            String query = "insert into user(name,password,email) values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            pstmt.setString(3,email);

            pstmt.executeUpdate();

            printWriter.println("complete");


        }catch (ClassNotFoundException | SQLException |InterruptedException e) {
            printWriter.println(e.getMessage());
        }
    }
}
