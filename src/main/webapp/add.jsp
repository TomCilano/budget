<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 10/8/16
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Movie</title>
</head>
<body>
Please input your budget data.

<form action="/create" method="post">
    <table>
        <tr> <td>Description:</td>              <td><input type="text" name="nDescription"></td></tr>
        <tr><td>Category:</td>          <td><input type="text" name="nCategory"></td></tr>
        <tr> <td>Budgeted amount:</td><td><input type="text" name="nBudgetedAmount"></td></tr>
        <tr> <td>Total Amount:</td><td><input type="text" name="nTotalAmount"></td></tr>

    </table>
    <input type="submit" name="Save"/>
</form>
<center><a href="/lineitems">BACK</a></center>
</body>
</html>