<%--
  Created by IntelliJ IDEA.
  User: LeDang
  Date: 29/05/2019
  Time: 3:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:url  var="edit" value="/giuongbenh/editform" />
    <c:url  var="addnew" value="/giuongbenh/addnew" />
</head>
<body>
<h1>Bang Danh Sach Loai Giuong Benh </h1>
<h5><a href="${addnew}?command=edit">AddNew</a></h5>
<div style="width: 980px; margin: 0 auto">

<table style="width:980px; border: 1px solid black;">
        <tr>
            <th style="width: 25%;">ID</th>
            <th style="width: 25%;">Tên</th>
            <th style="width: 25%;">Giá tiền</th>
            <th style="width: 20%;">Miêu tả</th>
            <th style="width: 5%;">Chuc nang</th>
        </tr>
    <c:forEach items="${listResult}" var="item">
        <tr>
            <td style="text-align: center"> ${item.id}    </td>
            <td style="text-align: center"> ${item.name}  </td>
            <td style="text-align: center"> ${item.price} </td>
            <td style="text-align:left"> ${item.description}</td>
            <td style="text-align:center"> <a href="${edit}?id=${item.id}&command=edit">Edit</a> ||
            <td style="text-align:center"> <a href="<c:url value="/giuongbenh/delete?id=${item.id}" />">DEL</a> </td>
        </tr>
    </c:forEach>

</table>
</div>



</body>
</html>
