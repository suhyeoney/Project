<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8" />
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
</head>
<body>

<h1>메인 페이지</h1>

<nav>
	<ul>
		<li><a href="/project/board/list">게시판 메인 페이지</a></li>
		<li><a href="/project/member/register">회원 가입</a></li>
		<c:if test="${empty loginId}">
			<li><a href="" id="login">로그인</a></li>
		</c:if>
		<c:if test="${not empty loginId}">
			Welcome, ${loginId}
			<button id="btnLogout">로그아웃</button>
		</c:if>
		<li><a href="/project/game/game">Game Start!!</a></li>
	</ul>
</nav>

<script>
$(document).ready(function () {
	$('#login').click(function () {
		event.preventDefault();
		location = encodeURI('/project/member/login?target=' + location.href);
	});
	
	$('#btnLogout').click(function () {
		location = '/project/member/logout';
	});
	
	if (${not empty registerResult and registerResult == "success"}) {
		alert('회원 가입 성공');
	}
});
</script>

</body>
</html>





