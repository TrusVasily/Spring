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
            background-color: white;
            color: black;
            border: 2px solid #4CAF50;
        }

        input[type=submit]:hover {
            background-color: #4CAF50; /* Green */
            color: white;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Hostel</title>
</head>
<body>
<form:form method="post" action="addHostel" modelAttribute="hostel">

    <table>

        <tr>
            <td><form:label path="HostID"> Host ID </form:label></td>
            <td><form:input path="hostID" readonly="true" disabled="true"/>
                    <form:hidden path="hostID"/>
        </tr>

        <tr>
            <td><form:label path="Name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="Address">Address</form:label></td>
            <td><form:input path="address" /></td>
        </tr>
        <tr>
            <td><form:label path="Phone">Phone</form:label></td>
            <td><form:input path="phone" /></td>
        </tr>
        <tr>
            <td><form:label path="City">City</form:label></td>
            <td><form:input path="city" /></td>
        </tr>
        <tr>
            <td><form:label path="EmployeeID">Employee ID</form:label></td>
            <td><form:input path="empoyeeID" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Hostel" /></td>
        </tr>
    </table>
</form:form>

<h3>hostel</h3>
<c:if test="${!empty hostelList}">
    <table class="data">
        <tr>
            <td>HostID</td>
            <td>Name</td>
            <td>Address</td>
            <td>Phone</td>
            <td>City</td>
            <td>EmployeeID</td>
            <td>Delete</td>
            <td>Edit</td>

        </tr>
        <c:forEach items="${hostelList}" var="hostel">
            <tr>
                <td>${hostel.hostID}</td>
                <td>${hostel.name}</td>
                <td>${hostel.address}</td>
                <td>${hostel.phone}</td>
                <td>${hostel.city}</td>
                <td>${hostel.employeeID}</td>
                <td><a href="deleteHostel/${hostel.hostID}">Delete</a></td>
                <td> <a href="updateHostel">Edit</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
