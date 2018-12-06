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
    <title>Employee</title>
</head>
<body>
<form:form method="post" action="addEmployee" modelAttribute="employee">

    <table>

        <tr>
            <td><form:label path="EmployeeID"> Employee ID </form:label></td>
            <td><form:input path="employeeID" />
        </tr>

        <tr>
            <td><form:label path="FirstName"> First Name </form:label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><form:label path="LastName"> Last Name </form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="Address">Address </form:label></td>
            <td><form:input path="address" /></td>
        </tr>
        <tr>
            <td><form:label path="Phone"> Phone </form:label></td>
            <td><form:input path="phone" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add Employee" /></td>
        </tr>
    </table>
</form:form>

<h3>Employee</h3>
<c:if test="${!empty employeeList}">
    <table class="data">
        <tr>
            <td>EmployeeID</td>
            <td>FirstName</td>
            <td>LastName</td>
            <td>Address</td>
            <td>Phone</td>
            <td>Delete;</td>
            <td>Edit;</td>

        </tr>
        <c:forEach items="${employeeList}" var="employee">
            <tr>
                <td>${employee.employeeID}</td>
                <td>${employee.firstName}</td>
                <td>${employee.lastName}</td>
                <td>${employee.address}</td>
                <td>${employee.phone}</td>

                <td><a href="deleteEmployee/${employee.employeeID}">Delete</a></td>
                <td> <a href="/updateEmployee">Update</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
