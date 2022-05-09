<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = (String) request.getAttribute("id");
String password = (String) request.getAttribute("password");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果画面</title>
</head>
<body>
<div>
  
  <p>ようこそ、<%= id %>さん</p>
  
  <a href="login.jsp">戻る</a>
</div>
</body>
</html>
