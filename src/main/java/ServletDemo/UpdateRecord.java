package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateRecord
 */
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ebookshop","root","root");
		    Statement stmt = conn.createStatement();
		    String useDB = "use ebookshop";
	        stmt.executeUpdate(useDB);
	        
	        String id = request.getParameter("bid");
			String tit = request.getParameter("btitle");
			String auth = request.getParameter("bauth");
			String price = request.getParameter("bprice");
			String qty = request.getParameter("bqty");
			
			int nid = Integer.parseInt(id);
			float nprice = Float.parseFloat(price);
			int nqty = Integer.parseInt(qty);
			
	        String update_query = "update books set title = ?, author = ?, price = ?, qty = ? where id = ?" ;
			PreparedStatement pstmt = conn.prepareStatement(update_query);
			
			pstmt.setString(1,tit);
			pstmt.setString(2,auth);
			pstmt.setFloat(3,nprice);
			pstmt.setInt(4,nqty);
			pstmt.setInt(5,nid);
			pstmt.executeUpdate();
			
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
					+"<title> Address</title>"
					+"</head>"
					+"<body>"
					+"<div>"
					+"<p><center><font size = 2000px; color = #8B4513><b> Updated Successfully!! </b></font></p>"
					+"<h2><font color = black><a href = 'LibMenu.jsp'>Click here to perform more operations...</a></font></h2><br>"
					+"<h2><font color = black><a href = 'DisplayRecord'>Click here to view table...</a></font></center></h2>"
					+"</div>"
					+"</body>"
					+"</html>");
			 
		}
		catch(Exception e)
		{
			out.println("<html><body>Exception thrown</body></html>");
		}
	}
	

}
