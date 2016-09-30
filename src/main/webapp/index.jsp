<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 2px solid ;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(odd){
            background:gainsboro;
        }
        tr:nth-child(even) {
            background-color: ghostwhite;
        }
    </style>
    <br>
    <title>BudgetApp</title>
</head>
<body background="http://youngaccountinginc.com/wp-content/themes/ppc-custom/media/background_02.jpg">
<center><b><u><h1>Budget App</h1></u></b></center>
<center><table>
    <tr>Line Items</tr>
    <th>Description</th>
    <th>Category</th>
    <th>Budgeted Amount</th>
    <th> Actual Amount</th>

</table></center>
<c:forEach items="${selectedLine}" var="lineItem">
    <c:out value="${lineItem.category}"/>
</c:forEach>
</body>
</html>
