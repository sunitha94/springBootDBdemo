<%--
  Created by IntelliJ IDEA.
  User: raju
  Date: 25/5/16
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form:form action="/employees/add" method="POST" modelAttribute="employee">
  Id: <form:input type="text" path="id" name="id" required="required"/><br/>
  Name: <form:input type="text" path="name" name="name" required="required"/><br/>
  <input type="submit" value="add">
</form:form>
</body>
</html>
