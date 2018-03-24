<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
 
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
 
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}
</style>
</head>
<body>
欢迎[${sessionScope.admin.aname }]访问
<br>
<table border="1">
	<tr>
		<th>图片</th><th>拾物名称</th><th>拾物描述</th><th>拾物地点</th><th>拾物时间</th><th>现位于</th>
	</tr>
	<c:forEach items="${requestScope.pick_list }" var="pick">
		<tr>
			<td><img src="images/${pick.ppic }" height="80"></td>
			<td>${pick.pname }</td>
			<td>${pick.pdescri }</td>
			<td>${pick.pplace }</td>
			<td>${pick.ptime }</td>
			<td>${pick.pnowplace }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>