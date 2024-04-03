<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-white bg-info mt-2">DANH SÁCH SẢN PHẨM</h1>

<a class="btn btn-info mt-1">Thêm sản phẩm</a>
    
<table class="table table-striped">
    <tr>
        <th></th>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th></th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td><img class="card-img-top" src="${p.image}" alt="${p.name}" style="width:300px"></td>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${String.format("%,d",p.price)} VNĐ</td>
            <td>
                <button class="btn btn-info">Cập nhật</button>
                <button class="btn btn-danger">Xóa</button>
            </td>
        </tr>
    </c:forEach>
</table>
