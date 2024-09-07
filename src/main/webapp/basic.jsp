<%--
  Created by IntelliJ IDEA.
  User: Arsalaan
  Date: 06/09/24
  Time: 11:41 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Random,java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page errorPage="error_ex.jsp" %>
<%@ taglib prefix="t" uri="/WEB-INF/tlds/mylib" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h5> Declarative Tags - <%! %></h5>
    <p>
        A JSP declaration is used to declare variables and methods in a page’s scripting language. The syntax for a declaration is as follows:
    </p>
    <%!
        int a = 50;
        int b = 25;
        String name = "Jacob";

        public int doSum() {
            return a+b;
        }

        public String reverse() {
            StringBuffer br = new StringBuffer(name);
            return br.reverse().toString();
        }
    %>

    <h5> Scriptlet Tag - <% %></h5>
    <p>A JSP scriptlet is used to contain any code fragment that is valid for the scripting language used in a page. The syntax for a scriptlet is as follows</p>
    <%
        out.println(a);
        out.println(b);
        out.println("<br/>");
        out.println(doSum());
        out.println("<br/>");
        out.println(reverse());
    %>

    <h5>Expression Tag - <%= doSum() %> </h5>
    <p>
        A JSP expression is used to insert the value of a scripting language expression, converted into a string, into the data stream returned to the client. When the scripting language is the Java programming language, an expression is transformed into a statement that converts the value of the expression into a String object and inserts it into the implicit out object.
    </p>
    <%@include file="header.jsp"%>
    <%
        Random m = new Random();
        int n = m.nextInt(10);
    %>

    <%=
        n
    %>
    <c:set var="name" value="Geekmozo India"></c:set>
    <c:out value="${name}"></c:out>

    <%=
        a/b
    %>

    <t:mytag></t:mytag>
</body>
</html>
