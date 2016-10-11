<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 10/9/16
  Time: 1:04 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Edit</title>
</head>
<body background="http://youngaccountinginc.com/wp-content/themes/ppc-custom/media/background_02.jpg">
<center><h1><u><b>Edit Items</b></u></h1></center>
<br>
<center>Edit data and click 'Save' to update!</center>
<br>
<center><form action="/update" method="post" border = 1>
    <table>
        <tr> <td>Description:</td>              <td><input type="text" name="nDescription" value="<c:out value="${anEdit.description}"/>"></td></tr>
        <tr><td>Category:</td>          <td><input type="text" name="nCategory" value="<c:out value="${anEdit.category}"/>"></td></tr>
        <tr> <td>Budgeted amount:</td><td><input type="text" name="nBudgetedAmount"value="<c:out value="${anEdit.budgetedAmount}"/>"></td></tr>
        <tr> <td>Total Amount:</td><td><input type="text" name="nTotalAmount" value="<c:out value="${anEdit.totalAmount}"/>"></td></tr>

    </table>
    <input type="submit" name="Save"/>
    <input type="hidden" name="nId" value="<c:out value="${anEdit.id}"/>"/>
</form>
</center>
</form>
</body>
</html>
