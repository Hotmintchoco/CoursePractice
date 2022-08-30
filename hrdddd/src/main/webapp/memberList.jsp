<%@page import="java.util.List"%>
<%@page import="DBPKG.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	DBConnection con = new DBConnection();
	List<MemberVO> list = con.memberList();
%>
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
	table { width: 900px; }
	table, th, td { border:1px solid #666; text-align: center; }
	#footer { height: 75px; background-color: aqua;}
</style>
</head>
<body>
	<div id="header">
		<h1>쇼핑몰 회원관리 ver 1.0</h1>
	</div>
	
	<nav>
		<a href="#">회원등록</a>
		<a href="#">회원목록조회/수정</a>
		<a href="#">회원매출조회</a>
		<a href="#">홈으로.</a>
	</nav>
	
	<div id="section">
		<h2>회원목록조회/수정</h2>
		<table>
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
			
			<%
				for(MemberVO member : list) {
					
			%>
			
			<tr>
				<td><%=member.getCustno()%></td>			
				<td><%=member.getCustname()%></td>			
				<td><%=member.getPhone()%></td>			
				<td><%=member.getAddress()%></td>			
				<td><%=member.getJoindate().substring(0, 10)%></td>			
				<td><%=member.getGrade()%></td>			
				<td><%=member.getCity()%></td>			
			</tr>
			<%
				}
			%>
		</table>
	</div>
	
	<div id="footer">
		<h2>HRDKOREA Copyright®2016 All rights reserved. Human Resources Development Service of Korea</h2>
	</div>
</body>
</html>