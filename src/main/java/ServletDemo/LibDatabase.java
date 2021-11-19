/*
 * It is a java file that creates database.
 */

package ServletDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class LibDatabase {
	
	 
	protected Connection getConnection()throws SQLException {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/";
			String user = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection established");
			return conn;
		} catch (ClassNotFoundException e) {
			 System.out.println("Connection not established");
			 return null;
		}
		 
	 }
	public void createDatabase() throws SQLException {
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			String sqldb = "create database if not exists ebookshop";
			stmt.executeUpdate(sqldb);
			System.out.println("Database created successfully..."); 
		}catch (SQLException e) {
			System.out.println("Database not created ");
		}
	}
	
	public void createBooktable() {
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			String useDB = "use ebookshop";
			stmt.executeUpdate(useDB);
			String create_books = "create table if not exists books (id INT unique, title VARCHAR(40), author VARCHAR(40), price FLOAT, qty INT)";
	        stmt.executeUpdate(create_books);
		}catch (SQLException e) {
			System.out.println("Boooktable is not created");
		}
	}
	public void createAuthtable() {
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			String useDB = "use ebookshop";
			stmt.executeUpdate(useDB);
		 
			String create_auth = "create table if not exists authentication (collegeid VARCHAR(10) unique, username VARCHAR(40), password VARCHAR(40))";
	        stmt.executeUpdate(create_auth);
	        
	        System.out.println("Table created successfully..."); 
	        
		} catch (SQLException e) {
			System.out.println("Table not created ");
		}
	}
	 
	public void insertBook(LibInput lib) {
		try{
			 Connection conn = getConnection();
			 Statement stmt = conn.createStatement();
			 String useDB = "use ebookshop";
			 stmt.executeUpdate(useDB);
			String insert_query = "insert into books(id, title, author, price, qty) values(?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(insert_query);
			
			pstmt.setInt(1, lib.getId());
			pstmt.setString(2, lib.getTitle());
			pstmt.setString(3, lib.getAuthor());
			pstmt.setFloat(4, lib.getPrice());
			pstmt.setInt(5, lib.getQty());
			
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			System.out.println("Record not inserted in book table");
		}
 
	}
	
	public void insertAuth(LibUserInput inp) {
		
		try{
			 Connection conn = getConnection();
			 Statement stmt = conn.createStatement();
			 String useDB = "use ebookshop";
			 stmt.executeUpdate(useDB);
			String insert_query = "insert into authentication(collegeid,username,password) values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(insert_query);
			
			pstmt.setString(1, inp.getCollegeId());
			pstmt.setString(2, inp.getUsername());
			pstmt.setString(3, inp.getPassword());
			 
			pstmt.executeUpdate();
 
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Data not inserted in authtable");
		}
	}
  

}