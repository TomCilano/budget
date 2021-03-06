<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>


    <br>
    <title>BudgetApp</title>
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
<center><b><u><h1>Budget App</h1></u></b></center>

<form method="post" action="/search">

    <center><table>
    <h1>Line Items</h1>
    Search <input type="text" name="searchByText"/>
    <input type="submit" name="Search"/>
<p></p>
    <thead>
    <tr><tr>
        <th>Edit</th>
        <th>Description</th>
        <th>Category</th>
        <th>Budgeted Amount</th>
        <th>Actual Amount</th>
        <th>Delete</th>
    </tr>
    </thead>

<c:forEach items="${lineitems}" var="line">

    <tr>
        <td><a href="/select?id=<c:out value="${line.id}"/>">EDIT</a></td>
        <td><c:out value="${line.description}"/></td>
        <td><c:out value="${line.category}"/></td>
        <td><c:out value="${line.budgetedAmount}"/></td>
        <td><c:out value="${line.totalAmount}"/></td>
        <td><a href="/delete?id=<c:out value="${line.id}"/>">DELETE</a></td>
    </tr>


</c:forEach>
</table></center>
</form>
<center><a href="/summary.jsp">SUMMARY HERE</a></center>
<br>
<br>
<center><a href="/add.jsp">Add Items</a></center>
</body>
</html>
