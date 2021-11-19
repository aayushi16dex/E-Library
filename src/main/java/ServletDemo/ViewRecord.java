package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
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
	        int nid = Integer.parseInt(id);
	        
			String search_query = "select * from books where id ="+nid ;
			 
			ResultSet rst = stmt.executeQuery(search_query);
			out.println("<html><br><h2><center>Record of book id: "+nid+"</center></h2></html>");
			 
			rst.next();
			int id1 = rst.getInt("id");
			String title1 = rst.getString("title");
			String author1 = rst.getString("author");
			float price1 = rst.getFloat("price");
			int qty1 = rst.getInt("qty");

			out.println("<html>"
					+ "<body>"
					+"<table border = 1 bgcolor = \"white\" align = \"center\" width = 50% height = 20%>"
					+ "	<tr bgcolor = \"lightblue\" align = \"center\"> "
					 
					+ "		<th>S.No</th> "
					+ "		<th>Book Id</th>"
					+ "		<th>Book Name</th>"
					+ "		<th>Author</th>"
					+ "		<th>Price</th>"
					+"      <th>Quantity</th>"
					+ "	</tr>\r\n"
					+ "	<tr align = \"center\">\r\n"
					+ "		<td>1</td>\r\n"
					+ "		<td>"+id1+"</td>"
					+ "		<td>"+title1+"</td>"
					+ "		<td>"+author1+"</td>"
					+ "		<td>"+price1+"</td>"
					+ "		<td>"+qty1+"</td>"
					+ "	</tr>"
					+ "</table>"
					+"</body></html>");
			 
			out.print("<html>"
					+"<head>"
					 
					+"<title>"
					+"Record"
					+"</title>"
					+"</head>"
					+"<body style='background-color: #F4F6F6;'>"
					+"<div>"
					+"<br><p><center><font color = #8B4513><h2><a href = 'LibMenu.jsp'>Click here to perform more operations...</a></h2></font> "
					
					+"<h2><font color = black><a href = 'DisplayRecord'>Click here to view table...</a></font></center></h2></p>"
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