<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication</title>
</head>
<%@ page import="ServletDemo.LibDatabase" %>
<%@ page import="java.sql.*" %>
<body>
<%
 
	String clgid = request.getParameter("uid");
	String passwrd = request.getParameter("pass");
	 
	String value1 = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);
		 
		Statement stmt = conn.createStatement();
		String useDB = "use ebookshop";
		stmt.executeUpdate(useDB);
	 
		String select_authquery = "select password from authentication where collegeid = ?";
		 
		PreparedStatement pstmt = conn.prepareStatement(select_authquery);
		pstmt.setString(1,clgid);
		pstmt.execute();
		ResultSet rst = pstmt.executeQuery();
		 
		rst.next();
		value1 = rst.getString("password"); 
 
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error in authentication");
	}
	
	 if(value1!=null){
		if(passwrd.equals(value1)){
			out.print("<html>"
					+"<head>"
					+"<style>"
					+ "div {"
					+ "  background-color: #F8F8FF;"
					+ "  width: 800px;"
					+ "  height: 300px;"
					+ "  border: 10px solid 	#191970;"
					+ "  padding: 100px;"
					+ "  margin-left: 300px;"
					+ "  margin-right: 00px;"
					+ "  margin-top: 100px;"
					+ "  margin-bottom: 20px;"
					+ "}"
					+ "</style>"
					+"<title>"
					+"Address"
					+"</title>"
					+"</head>"
					+"<body>"
					+"<div>"
					+"<p><center><font size = 2000px; color = #8B4513><h2>Successully logged in!!</h2></font>"
					 
					+"<h2><a href = 'LibMenu.jsp'>Click here to proceed</a></h2>"
					+"</div>"
					+"</body>"
					+"</html>");
		}
		else{
			out.print("<html>"
					+"<head>"
					+"<style>"
					+ "div {"
					+ "  background-color: #F8F8FF;"
					+ "  width: 600px;"
					+ "  height: 150px;"
					+ "  border: 10px solid 	#191970;"
					+ "  padding: 100px;"
					+ "  margin-left: 300px;"
					+ "  margin-right: 00px;"
					+ "  margin-top: 150px;"
					+ "  margin-bottom: 20px;"
					+ "}"
					+ "</style>"
					+"<title>"
					+"Address"
					+"</title>"
					+"</head>"
					+"<body>"
					+"<div>"
					+"<br><p><center><font size = 2000px; color = #8B4513><b> Incorrect password!! </b></font> </p>"
					+"<h2><a href = 'Login.jsp'>Click here to login!!</a></center></h2>"
					+"</div>"
					+"</body>"
					+"</html>");
		}
	}
	else{
		out.print("<html>"
				+"<head>"
				+"<style>"
				+ "div {"
				+ "  background-color: #F8F8FF;"
				+ "  width: 600px;"
				+ "  height: 150px;"
				+ "  border: 10px solid 	#191970;"
				+ "  padding: 100px;"
				+ "  margin-left: 300px;"
				+ "  margin-right: 00px;"
				+ "  margin-top: 150px;"
				+ "  margin-bottom: 20px;"
				+ "}"
				+ "</style>"
				+"<title>"
				+"Address"
				+"</title>"
				+"</head>"
				+"<body>"
				+"<div>"
				+"<br><p><center><font size = 2000px; color = #8B4513><b>You are not registered user!!</b></font></p>"
				+"<h2 font color = 'black'><a href = 'index.jsp'>Click here to register</a></center></h2>"
				+"</div>"
				+"</body>"
				+"</html>");
	}


%>

</body>
</html>