package hello;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class library1 extends ActionSupport {
	private String Author;
	private List<String> list=new ArrayList<String>();
	private String title,ISBN;
	Connection connect = DB_connect.connect();
	public String getTitle() {			
		return title;
	}
	public String execute(){
		try{
			Statement stmt;
		  	String sql = "select AuthorID from Author where Name='" + Author + "'";
		  	stmt = (Statement)connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
       
        //5.��ӡ������������
        String author_id = new String();
        while(rs.next()) {    
        	author_id=rs.getString("AuthorID");   
        }
        sql = "select Title,ISBN from Book where AuthorID="+author_id;
        ResultSet s = stmt.executeQuery(sql);
        list.clear();
        while(s.next()) {   
        	title=s.getString("Title");
        	list.add(title);
        } 
        //���Բ������ݿ�Ĺ��ܣ�  
        //String inSql = "insert into test(user,addr) values('����2','�µ�ַ2')";  
        //stmt.executeUpdate(inSql);  
          
        //6.�ͷ���Դ���ر����ӣ�����һ�����õ�ϰ�ߣ�  
        rs.close();  
        stmt.close();  
        connect.close();		
		return "success";}
		catch(Exception e){
			return "error";			
		}
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
}
	public void setAuthor(String Author){
		this.Author = Author;
	}
	
}

