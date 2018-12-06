<%--
  Created by IntelliJ IDEA.
  User: NotePad.by
  Date: 28.11.2018
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Hostel</title>
  </head>
  <body>
  <h3>Hostel</h3>
<div>
    <a href="<c:url value="/Booking"/>">Booking</a>
    <a href="<c:url value="/Customer"/>">Customer</a>
    <a href="<c:url value="/Employee"/>">Employee</a>
    <a href="<c:url value="/Hostel"/>">Hostel</a>
    <a href="<c:url value="/Room"/>">Room</a>
    <a href="<c:url value="/RoomType"/>">RoomType</a>
</div>
  </body>
</html>
