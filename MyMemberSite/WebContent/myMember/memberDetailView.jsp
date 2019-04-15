<%@page import="java.util.ArrayList"%>
<%@page import="net.tom.member.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보조회</title>
</head>
<body>

<jsp:include page="/Header.jsp"/>

	<% 
		MemberDto memberDto =  
	 			(MemberDto)request.getAttribute("memberDto");
	%>
	
	<h1>회원정보조회</h1>
	<form action="./update" method="post">
		번호: <input type="text" name='no' value="<%=memberDto.getNo()%>" readonly><br>
		이름: <input type="text" name='name' value="<%=memberDto.getName()%>"><br>
		이메일: <input type="text" name='email' value="<%=memberDto.getEmail()%>"><br>
		가입일: <%=memberDto.getCreateDate()%><br>
		<input type="submit" value='수정'>
		<input type="button" value='뒤로가기' onclick='location.href="./listTest"'>
		<input type="button" value='삭제' onclick='location.href="./delete?no=<%=memberDto.getNo()%>"'>
	</form>
	
<jsp:include page="/Tail.jsp"/>

</body>
</html>