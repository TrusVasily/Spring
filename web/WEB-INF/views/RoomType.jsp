<%--
  Created by IntelliJ IDEA.
  User: NotePad.by
  Date: 02.12.2018
  Time: 2:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <style type="text/css">
        td {

            border: 2px solid black;
        }
        tr:hover {background-color: #f5f5f5;}
        tr:nth-child(even) {background-color: #f2f2f2;}

        input[type=submit] {
            background-color: whitesmoke;
            color: black;
            border: 2px solid #4CAF50;
        }

        input[type=submit]:hover {
            background-color: #4CAF50; /* Green */
            color: white;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Room Type</title>
</head>
<body>
<form:form method="post" action="addRoomType" modelAttribute="roomType">

    <table>

        <tr>
            <td><form:label path="RoomType">Room Type</form:label></td>
            <td><form:input path="roomType" /></td>
        </tr>
        <tr>
            <td><form:label path="RoomName">Room Name </form:label></td>
            <td><form:input path="roomName" /></td>
        </tr>
        <tr>
            <td><form:label path="Price">Price</form:label></td>
            <td><form:input path="price" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add RoomType" /></td>
        </tr>
    </table>
</form:form>

<h3>Room Type</h3>
<c:if test="${!empty roomTypeList}">
    <table class="data">
        <tr>
            <td>Room Type</td>
            <td>Room Name</td>
            <td>Price</td>
            <td>Delete</td>
            <td>Edit</td>

        </tr>
        <c:forEach items="${roomTypeList}" var="roomType">
            <tr>
                <td>${roomType.roomType}</td>
                <td>${roomType.roomName}</td>
                <td>${roomType.price}</td>

                <td><a href="deleteRoomType/${roomType.roomType}">Delete</a></td>
                <td> <a href="updateRoomType">Edit</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
