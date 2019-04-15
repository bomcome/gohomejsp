<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
 	tr, td {
 		border-bottom: 1px solid #8C8C8C;
 		height: 35px; 
 	}
 	
	#no {
		width: 150px;
	}
	.title{
		width: 500px;
		
	}
	#writer{
		width: 230px;
	}
	#createDate{
		width: 200px;
	}
	td {
		text-align: center;
		font-size: 14px;
		
	}
	.title {
		text-align: left;
	}
	#top td{
		font-weight: bold;
		font-size: 15px;
		
	}
	#top .title{
		text-align: center;
	}
	
	#board {
		margin-left: 380px;
		margin-right: 380px;
		border-collapse: collapse;
 		margin-top: 50px;
	}
	
	#freeBoard {
		float: left;
		font-weight: bold;
		font-size: 30px;
		color: #8C8C8C;
	}
	
	#boardInput #formTag{
		text-align: left;
	}
	input {
		margin-top: 8px;
	}
	#boardListContainer {
		width: 1920px;
	}
	
	#formTag span{
		text-align: right;
	}
</style>
<title>Insert title here</title>

</head>
<body>

	<jsp:include page="../Header.jsp"/>
	<div id=boardListContainer>
	<table id="board">
		<tr>
			<td id="boardInput" colspan="4">
				<span id="freeBoard">우동맛게시판(${totalCount})</span>
					<form action="./list.do" method="get" id="formTag">	
						<span>
							<input type="text" name="keyword" value="${keyword}">
							<input type="submit" value="검색">
						</span>
					</form>
			</td>
		</tr>
		<tr id="top">
			<td id="no">번호</td>
			<td class="title">제목</td>
			<td id="writer">작성자</td>
			<td id="createDate">작성일</td>
		</tr>
		
		<c:forEach var="boardVo" items="${boardList}">
			<tr>
				<td>${boardVo.boardNo}</td>
				<td class="title">
					<a href='./one.do?boardNo=${boardVo.boardNo}'>${boardVo.title}</a>
				</td>
				<td>${boardVo.nickname}</td>
				<td>${boardVo.createDate}</td>
			</tr>
		</c:forEach>
	</table>
	
	<jsp:include page="/WEB-INF/views/common/paging.jsp">
		<jsp:param value="${pagingMap}" name="pagingMap"/>
	</jsp:include>

	<form action="./list.do" id="pagingForm" method="post">
		<input type="hidden" id="curPage" name="curPage" 
			value="${pagingMap.memberPaging.curPage}">
	</form>
	
	
	
	<button onclick="href.location=''">이전화면</button>
	<button onclick="location.href='add.do'">글쓰기</button>
	
	</div>
	
	<jsp:include page="../Tail.jsp"/>
</body>
</html>