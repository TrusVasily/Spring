<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: NotePad.by
  Date: 02.12.2018
  Time: 2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Booking</title>
</head>
<body>
<form:form method="post" action="updateBooking" commandName="booking">

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
                <input type="submit" value="Update Booking" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>
