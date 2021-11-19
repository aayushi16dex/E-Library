package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class DisplayRecords
 */
public class DisplayRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ebookshop","root","root");
		    Statement stmt = con.createStatement();
		    String useDB = "use ebookshop";
	        stmt.executeUpdate(useDB);
	        
			String select_query = "Select * from books" ;
			 
			ResultSet rst = stmt.executeQuery(select_query);

			out.println("<html>"
					+ "<body>"
					+"<table border = 1 bgcolor = \"white\"  width = 30% height = 5%>"
					+ "	<tr bgcolor = \"lightblue\" align = \"center\"> "
					
					+ "		<th>Book Id</th>"
					+ "		<th>Book Name</th>"
					+ "		<th>Author</th>"
					+ "		<th>Price</th>"
					+"      <th>Quantity</th>"
					+ "	</tr> "
					 
					+ "</table>"
					+"</body></html>"); 
			while (rst.next()) 
			{
				int id1 = rst.getInt("id");
				String title1 = rst.getString("title");
				String author1 = rst.getString("author");
				float price1 = rst.getFloat("price");
				int qty1 = rst.getInt("qty");
				out.println("<html>"
						+ "<body style='background-color: #F4F6F6;'><p><b>"
						+id1+" || "+title1+" || "+author1+" || "+price1+" || "+qty1+"</b></p></body></html>");
			}
			 
		}
		catch(Exception e)
		{
			out.println("<html><body>Exception thrown</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
