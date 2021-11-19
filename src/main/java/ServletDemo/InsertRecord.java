package ServletDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class InsertRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertRecord() {
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
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		String id = request.getParameter("bid");
		String title = request.getParameter("btitle");
		String author = request.getParameter("bauth");
		String price = request.getParameter("bprice");
		String qty = request.getParameter("bqty");
		
		int nid = Integer.parseInt(id);
		float nprice = Float.parseFloat(price);
		int nqty = Integer.parseInt(qty);
		
		LibInput user = new LibInput(nid, title, author,  nprice,  nqty);
		
		LibDatabase db = new LibDatabase();
		try {
			db.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.createBooktable();
		db.insertBook(user);
		
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
				+"<p><center><font size = 2000px; color = #8B4513><b> Inserted Successfully!! </b></font></p>"
				+"<h2><font color = black><a href = 'LibMenu.jsp'>Click here to perform more operations...</a></font></h2><br>"
				+"<h2><font color = black><a href = 'DisplayRecord'>Click here to view table...</a></font></center></h2>"
				+"</div>"
				+"</body>"
				+"</html>");	
	}
}