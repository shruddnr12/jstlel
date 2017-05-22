<%@page import="vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MemberVo vo1 = new MemberVo();
	vo1.setNo( 1L );
	vo1.setEmail( "kickscar1@gmail.com" );
	pageContext.setAttribute( "vo1", vo1 );
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>객체 접근</h3>
	== scope로 접근1 == <br>
	${pageScope.vo1.no } <br>
	${pageScope.vo1.email } <br>
	${requestScope.vo2.no } <br>
	${requestScope.vo2.email } <br>
	${sessionScope.vo3.no } <br>
	${sessionScope.vo3.email } <br>	
	${applicationScope.vo4.no } <br>
	${applicationScope.vo4.email } <br>	
	
	== scope로 접근2 == <br>
	${vo1.no } <br>
	${vo1.email } <br>
	${vo2.no } <br>
	${vo2.email } <br>
	${vo3.no } <br>
	${vo3.email } <br>	
	${vo4.no } <br>
	${vo4.email } <br>		
</body>
</html>