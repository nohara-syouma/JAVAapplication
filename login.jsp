<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<%
String id = (String) request.getAttribute("id");
String password = (String) request.getAttribute("password");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
  <form action="login" method="post">
  <h3>アプリの実行結果</h3>
  
  
  	<c:if test="${mati eq 'ng'}"> 
	<p>IDまたはPASSが間違っています</p>
	</c:if>
  
     
    <div>ID: <input type="text" name="id">
    <c:if test="${not empty id}"> 
    <%= id %>
    </c:if>
    </div>
      
    <div>PASS: <input type="password" name=password>
    <c:if test="${not empty password}"> 
    <%= password %>
    </c:if>
    </div>
    
    <div><button type="submit">ログイン</button></div>
  </form>
</div>

</body>
</html>