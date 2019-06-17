<%--
  Created by IntelliJ IDEA.
  User: LeDang
  Date: 30/05/2019
  Time: 10:57 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- jstl core tag ( thẻ kiểm soát các hành vi trang -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>edit</title>
    <c:url var="edit" value="/giuongbenh/CreateOrEdit" />
</head>
<body>
<h1 > UPDATE AND CREATE </h1>

    <form:form action="${edit}" method="get" commandName ="gb">
        <label>Name:</label>
        <form:input path="name" />
        <br/>
        <label>price:</label>
        <form:input path="price" />
        <br/>
        <label>Description:</label>
        <form:input path="description" />
        <br/>
        <form:hidden path="id" />
       <!-- <input type="hidden" name="command" value="SaveOrEdit" /> -->
        <input type="submit"  value="save" />
    </form:form>
</body>
</html>
