<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	* { margin: 0 auto; }
	#header { height: 100px; background-color: blue; }
	h1, h2 { text-align: center; align-content: center; }
	h1 {  line-height: 100px; }
	h2 {  line-height: 75px; }
	nav { height: 50px; background-color: purple;  }
	nav a { color: white; text-decoration: none; margin-left: 50px;  line-height: 50px; }
	#section { height: 600px; background-color: #d5d5d5; }
	#section p { margin-left: 20px; }
	#footer { height: 75px; background-color: aqua;}
</style>
</head>
<body>
	<div id="header">
		<h1>쇼핑몰 회원관리 ver 1.0</h1>
	</div>
	
	<nav>
		<a href="#">회원등록</a>
		<a href="memberList.jsp">회원목록조회/수정</a>
		<a href="#">회원매출조회</a>
		<a href="#">홈으로.</a>
	</nav>
	
	<div id="section">
		<h2>쇼핑몰 회원관리 프로그램</h2>
		<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</p>
		<p>프로그램 작성 순서</p>
		<p>1.회원정보 테이블을 생성한다.</p>
		<p>2.매출정보 테이블을 생성한다.</p>
		<p>3.회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</p>
		<p>4.회원정보 입력 화면프로그램을 작성한다.</p>
		<p>5.회원정보 조회 프로그램을 작성한다.</p>
		<p>6.회원매출정보 조회 프로그램을 작성한다.</p>
	</div>
	
	<div id="footer">
		<h2>HRDKOREA Copyright®2016 All rights reserved. Human Resources Development Service of Korea</h2>
	</div>
</body>
</html>