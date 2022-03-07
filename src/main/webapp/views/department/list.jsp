<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sach phong ban</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Code</th>
				<th>Name</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list_phong_ban}" var="department">
				<tr>
					<td>${department.id}</td>
					<td>${department.code}</td>
					<td>${department.name}</td>
					<td>${department.status}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>