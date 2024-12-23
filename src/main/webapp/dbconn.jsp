<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	Connection conn=null;
	
	try{
		String url="jdbc:mysql://localhost:3306/BookMarketDB";
		String user="root";
		String password="1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		
	}catch(SQLException e){
		out.println("데이터베이스 연결에 실패했습니다<br>");
		out.println("SQLException: "+ex.getMessage());
	}
%>