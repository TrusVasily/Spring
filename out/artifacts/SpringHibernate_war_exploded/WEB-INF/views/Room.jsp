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
    <title>Room</title>
</head>
<body>
<form:form method="post" action="addRoom" modelAttribute="room">

    <table>

        <tr>
            <td><form:label path="RoomID"> Room ID </form:label></td>
            <td><form:input path="roomID" readonly="true" disabled="true"/>
                    <form:hidden path="roomID"/>
        </tr>

        <tr>
            <td><form:label path="RoomType">Room Type </form:label></td>
            <td><form:input path="roomType" /></td>
        </tr>
        <tr>
            <td><form:label path="RoomDescription">Room Description </form:label></td>
            <td><form:input path="roomDescription" /></td>
        </tr>
        <tr>
            <td><form:label path="HotelID">Hotel ID </form:label></td>
            <td><form:input path="hotelID" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add Room" /></td>
        </tr>
    </table>
</form:form>

<h3>Room</h3>
<c:if test="${!empty roomList}">
    <table class="data">
        <tr>
            <td>RoomID</td>
            <td>RoomType</td>
            <td>RoomDescription</td>
            <td>HotelID</td>
            <td>Delete</td>
            <td>Edit</td>

        </tr>
        <c:forEach items="${roomList}" var="room">
            <tr>
                <td>${room.roomID}</td>
                <td>${room.roomType}</td>
                <td>${room.roomDescription}</td>
                <td>${room.hotelID}</td>
                <td><a href="deleteRoom/${room.roomID}">Delete</a></td>
                <td> <a href="updateRoom">Edit</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
