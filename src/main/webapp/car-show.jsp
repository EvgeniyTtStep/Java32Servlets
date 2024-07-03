<%@ page import="servlets.Car" %><%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 03.07.2024
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="servlets.Car" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Car show</h1>

<p>Car name: <% out.println(request.getAttribute("name")); %></p>
<p>Vendor: <%= request.getAttribute("vendor") %>
</p>
<p>Description: <%= request.getAttribute("desc")%>
</p>

<h2>Car object</h2>

<%
    Car car = (Car) request.getAttribute("car");
%>

<p>Car name: <% out.println(((Car) request.getAttribute("car")).getName()); %></p>
<p>Vendor: <%= car.getVendor() %></p>
<p>Description: ${car.desc} </p>


</body>
</html>
