<%--
  Created by IntelliJ IDEA.
  User: NotePad.by
  Date: 30.11.2018
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">

        a:link, a:visited {
            background-color: white;
            color: black;
            border: 2px solid green;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        a:hover, a:active {
            background-color: green;
            color: white;
        }
    </style>
</head>
<div>
    <a href="${pageContext.request.contextPath}/">Home</a>
    <a href="${pageContext.request.contextPath}/Booking" >Booking</a>
    <a href="${pageContext.request.contextPath}/Customer">Customer Info</a>
    <a href="${pageContext.request.contextPath}/Employee">Employee Info</a>
    <a href="${pageContext.request.contextPath}/Hostel">Hostel</a>
    <a href="${pageContext.request.contextPath}/Room">Room</a>
    <a href="${pageContext.request.contextPath}/RoomType">Room Type</a>
</div>
<body>

</body>
</html>
