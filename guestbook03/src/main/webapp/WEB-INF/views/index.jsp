<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%pageContext.setAttribute("newline", "\n");%> <!-- contents의 개행을 나타내주는것은 불가피하게 자바언어가 필요 -->

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>

<body>
	<form action="./add" method="post">
	<table border=1 width=500>
		<tr>
			<td>이름</td><td><input type="text" name="name"></td>
			<td>비밀번호</td><td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td colspan=4><textarea name= "contents" cols=60 rows=5></textarea></td>
		</tr>
		<tr>
			<td colspan=4 align=right><input type="submit" value="제출"></td>
		</tr>
	</table>
	</form>
	<br>
	
	
	<!-- 게스트 리스트 -->
	<c:set var = "count" value = "${fn:length(list) }" />
	<c:forEach var = "vo" items = '${list }' varStatus = 'status'>
	<table width = "510" border = "1">
		<tr>
			<td>[${count - status.index }]</td>
			<td>${vo.name }</td>
			<td>${vo.date }</td>
			<td><a href="./delete?no=${vo.no }">삭제</a></td> <!-- RequestParam 방식 -->
			<!-- <td><a href="./delete/${vo.no }">삭제</a></td>  PathVariable 방식-->
		</tr>
		
		<tr>
			<td colspan=4>${fn:replace(vo.contents, newline, '<br/>') }</td>
		</tr>
	

	</table>
	</c:forEach>
	
</body>
</html>