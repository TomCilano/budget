<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>Summary</title>
</head>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 50%;
    }

    td, th {
        border: 2px solid #363636;
        text-align: left;
        padding: 8px;
    }
    tr:nth-child(odd) {
        background-color: beige;
    }
    tr:nth-child(even) {
        background-color: lightblue;
    }
    </style>
<body background="http://youngaccountinginc.com/wp-content/themes/ppc-custom/media/background_02.jpg">
<center><table class="sortable">
    <thead>
    <br>
    <br>
    <tr>
    <tr><h2>Line Items</h2>
        <th>Category</th>
        <th>Budgeted Total</th>
        <th>Actual Total</th>
    </tr>
    </thead>
<c:forEach items="${total}" var="total">
    <tr>
        <td><c:out value="${total.category}"/></td>
        <td><c:out value="${total.budgetTotal}"/></td>
        <td><c:out value="${total.actualTotal}"/></td>
    </tr>
</c:forEach>
</table></center>
<table align="center">
    <thead>
   <tr>
    <tr>
      <center><h2>Totals</h2></center>
        <th>Budget</th>
        <th>Actual</th>
       <th>Difference</th>
    </tr>
    </thead>
        <tr>
            <td><c:out value="${totalbudget}"/></td>
            <td><c:out value="${totalamount}"/></td>
            <td><c:out value="${difference}"/></td>

        </tr>

</table>
<center><a href="index.jsp">BACK</a></center>

</body>
</html>
