<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<body>



This is ${student.firstName } ${student.secondName } page.
<br>

This student is confirmed and he comes form: ${student.country}

<br>

Favourite Laguage of studeng is: ${student.favoriteLanguage}

<br>
<br>

Operating system:

<ul>
<c:forEach var="temp" items="${student.knownLanguages}">
<li>${temp}</li>


</c:forEach>

<li> ${temp }</li>
</ul>


</body>

</head>


</html>