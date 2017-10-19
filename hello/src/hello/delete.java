package hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class delete extends ActionSupport{
	public String bookisbn;
	Connection connect = DB_connect.connect();
	public String execute(){
		
		
		try{
			Statement stmt;
		  	String sql = "delete from Book where ISBN='" + bookisbn + "'";
		  	stmt = (Statement)connect.createStatement();
			stmt.execute(sql);
		    
		    stmt.close();  
		    connect.close();		
			return "success";
		}
		catch(Exception e){
			return "error";			
		}
	}
	public String getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(String bookisbn) {
		this.bookisbn=bookisbn;
	}
	
}
