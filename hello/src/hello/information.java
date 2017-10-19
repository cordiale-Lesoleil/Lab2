package hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
public class information extends ActionSupport {

	private List<String> list=new ArrayList<String>();
	private String BT;
	private String bookisb;
	public List<String> getList(){
		return list;
	}
	Connection connect = DB_connect.connect();
	public String execute(){
		try{
			Statement stmt;
		  	String sql = "select * from Book where Title='" + BT + "'";
		  	stmt = (Statement)connect.createStatement();
			ResultSet res = stmt.executeQuery(sql);
		    
		    list.clear();
		    try{
			    while(res.next()) {    
			    	list.add("AuthorID:"+res.getString("AuthorID")); 
			    	bookisb=res.getString("ISBN");
			    	list.add("ISBN:"+bookisb);
			    	list.add("Publishdate:"+res.getString("Publishdate"));
			    	list.add("Publisher:"+res.getString("Publisher"));
			    	list.add("Title:"+res.getString("Title"));
			    	list.add("Price:"+res.getDouble("Price"));
			    }
			   
		    }		    
		    catch(Exception e){
		    	return "error";
		    }
		    res.close();  
		    stmt.close();  
		    connect.close();		
			return "success";
		}
		catch(Exception e){
			return "error";			
		}
	}
	public String getBT() {
		return BT;
	}
	public void setBT(String BT) {
		this.BT = BT;
	}
	public String getBookisb() {
		return bookisb;
	}
	public void setBookisb(String bookisb) {
		this.bookisb = bookisb;
	}
	
}
