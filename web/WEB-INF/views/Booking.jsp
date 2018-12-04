<%--
  Created by IntelliJ IDEA.
  User: NotePad.by
  Date: 30.11.2018
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Booking</title>
</head>
<body>

<jsp:include page="Menu.jsp"></jsp:include>

<form:form method="post" action="addBooking" commandName="booking">

    <table>
        <tr>
            <td><form:label path="BookingID"> Booking ID </form:label></td>
            <td><form:input path="bookingID" /></td>
        </tr>
        <tr>
            <td><form:label path="CustomerID"> Customer ID </form:label></td>
            <td><form:input path="customerID" /></td>
        </tr>
        <tr>
            <td><form:label path="RoomID"> Room ID </form:label></td>
            <td><form:input path="roomID" /></td>
        </tr>
        <tr>
            <td><form:label path="BookingDate">Booking Date </form:label></td>
            <td><form:input path="bookingDate" /></td>
        </tr>
        <tr>
            <td><form:label path="DateIN">Date IN </form:label></td>
            <td><form:input path="dateIN" /></td>
        </tr>
        <tr>
            <td><form:label path="DateOUT">Date Out </form:label></td>
            <td><form:input path="dateOUT" /></td>
        </tr>
        <tr>
            <td><form:label path="Bill">Bill </form:label></td>
            <td><form:input path="bill" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Booking" /></td>
        </tr>
    </table>
</form:form>

<h3>Booking</h3>
<c:if test="${!empty bookingList}">
    <table class="data">
        <tr>
            <td>BookingID</td>
            <td>CustomerID</td>
            <td>RoomID</td>
            <td >BookingDate</td>
            <td>DateIN</td>
            <td>DateOUT</td>
            <td>Bill</td>
            <td>Edit;</td>
            <td>Delete;</td>

        </tr>
        <c:forEach items="${bookingList}" var="booking">
            <tr>
                <td>${booking.bookingID}</td>
                <td>${booking.customerID}</td>
                <td>${booking.roomID}</td>
                <td>${booking.bookingDate}</td>
                <td>${booking.dateIN}</td>
                <td>${booking.dateOUT}</td>
                <td>${booking.bill}</td>

                <td><a href="deleteBooking/${booking.bookingID}">Delete</a></td>
                <td> <a href="updateBooking/${booking.bookingID}">Edit</a> </td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
