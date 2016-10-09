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
<body>
Click save to update.
<form action="/create" method="post">
    <table>
        <tr> <td>Description:</td>              <td><input type="text" name="nDescription" value="<c:out value="${anEdit.description}"/>"></td></tr>
        <tr><td>Category:</td>          <td><input type="text" name="nCategory" value="<c:out value="${anEdit.category}"/>"></td></tr>
        <tr> <td>Budgeted amount:</td><td><input type="text" name="nBudgetedAmount"value="<c:out value="${anEdit.budgetedAmount}"/>"></td></tr>
        <tr> <td>Total Amount:</td><td><input type="text" name="nTotalAmount" value="<c:out value="${anEdit.totalAmount}"/>"></td></tr>

    </table>
    <input type="submit" name="Save"/>
</form>

</form>
</body>
</html>
