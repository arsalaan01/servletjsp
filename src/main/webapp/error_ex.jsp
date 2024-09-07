<%--
  Created by IntelliJ IDEA.
  User: Arsalaan
  Date: 07/09/24
  Time: 12:27 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
    <style>
        div {
            height: 250px;
            width: 100%;
            background-color: darkgreen;
            color: white;
            padding: 20px;
        }
    </style>
</head>
<body>
    <div>
        <h2>Error Page </h2>
        <h5><%= exception %></h5>
    </div>
</body>
</html>
