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
<body background="http://youngaccountinginc.com/wp-content/themes/ppc-custom/media/background_02.jpg">
<center>Please input your budget data.</center>
<br>
<br>
<center><form action="/create" method="post" border="1">
    <table>
        <tr> <td>Description:</td>              <td><input type="text" name="nDescription"></td></tr>
        <tr><td>Category:</td>          <td><input type="text" name="nCategory"></td></tr>
        <tr> <td>Budgeted amount:</td><td><input type="text" name="nBudgetedAmount"></td></tr>
        <tr> <td>Total Amount:</td><td><input type="text" name="nTotalAmount"></td></tr>
    </table>
    <br>
    <input type="submit" name="Save"/>
</form></center>
<br>
<br>
<center><a href="/lineitems">BACK</a></center>
</body>
</html>