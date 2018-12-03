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
    <title>Title</title>
</head>
<body>
<jsp:include page="Menu.jsp"></jsp:include>

<form:form method="post" action="addCustomer" commandName="customer">

    <table>
        <tr>
            <td><form:label path="CustomerID"> Customer ID </form:label></td>
            <td><form:input path="customerID" /></td>
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
            <td><form:label path="Passport">Passport </form:label></td>
            <td><form:input path="passport" /></td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add Booking" /></td>
        </tr>
    </table>
</form:form>

<h3>Customer</h3>
<c:if test="${!empty customerList}">
    <table class="data">
        <tr>
            <td>CustomerID</td>
            <td>FirstName</td>
            <td>LastName</td>
            <td>Address</td>
            <td>Phone</td>
            <td>Passport</td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>

        </tr>
        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.customerID}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.address}</td>
                <td>${customer.phone}</td>
                <td>${customer.passport}</td>

                <td><a href="deleteCustomer/${customer.customerID}">Delete</a></td>
                <td> <form action="updateEmployee.jsp" method="post"></form> Update</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
