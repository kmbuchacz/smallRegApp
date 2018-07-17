<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>

<html>
<head>
<title>This is main Page.</title>
</head>

<body>

<h1>WELCOME</h1>
<br>

<form:form action="processForm" modelAttribute="student">
<div style="margin-bottom: 20px">
<form:input path="firstName" value="Give your first name here"/>
<br>
</div>
 
<div style="margin-bottom: 20px">
<form:input path="secondName" value="Give your second name here"/>
<br></div>
 <div>
 
 Country:<form:select path="country" style="margin-bottom: 20px">

<form:options items="${student.countryList}"/> 
</form:select>
 
 
 </div>
<br>


<div>

Java<form:radiobutton path="favoriteLanguage" value="Java"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>

</div>
Operation systems:
Java <form:checkbox path="knownLanguages" value="Java"/>
PHP <form:checkbox path="knownLanguages" value="PHP"/>
C# <form:checkbox path="knownLanguages" value="C#"/>

<div>


</div>
<input type="submit" value="Submit"/> 
</form:form>





</body>



</html>