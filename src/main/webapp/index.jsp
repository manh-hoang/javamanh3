
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ba thang tao</title>
</head>
<fmt:setLocale value="${lang}"/>
<fmt:setBundle basename="lang.content" var="msg"/>

<body>
	<a href="department">danh sach phong ban</a>
	<a href="emloyee">danh sách nhân viên</a>

</body>
</html>