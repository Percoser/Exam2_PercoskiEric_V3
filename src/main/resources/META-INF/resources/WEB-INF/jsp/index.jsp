<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Exam 2 - Percoski,Eric</title>

    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2 style="float: left; padding-left: 40%">Top 6 Most Common Viruses</h2>

<table>
    <tr>
        <th>Virus Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Incubation Period</th>
        <th>Mortality Rate</th>
        <th>Image</th>

    </tr>
    <c:forEach var="listitem" items="${virusList}">
        <tr>
            <td>${listitem.id}</td>
            <td>${listitem.name}</td>
            <td>${listitem.description}</td>
            <td>${listitem.symptoms}</td>
            <td>${listitem.duration}</td>
            <td>${listitem.mortalrate}</td>
            <td>${listitem.image}</td>


            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>