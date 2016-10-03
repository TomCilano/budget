<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>

    <br>
    <title>BudgetApp</title>
</head>
<body background="http://youngaccountinginc.com/wp-content/themes/ppc-custom/media/background_02.jpg">
<center><b><u><h1>Budget App</h1></u></b></center>
<form method="post" action="/budget/budgetItems">
<center><table border="1">
<thead>
    <tr>
    <tr>Line Items
    <th>Description</th>
    <th>Category</th>
    <th>Budgeted Amount</th>
    <th> Actual Amount</th>
    </tr>
    </thead>

<c:forEach items="${selectedLine}" var="line">
    <tr>
      <th><c:out value="${line.lin_category}"/></th>
    </tr>
</c:forEach>
</table></center>
</form>
</body>
</html>
