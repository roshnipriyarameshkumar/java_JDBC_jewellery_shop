package com.roshjewel;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.*;

public class Inventory
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	DBUtil db=new DBUtil();
	Connection con;
	Jewellery jw=new Jewellery();
//List<Jewellery> l=new ArrayList<>();
 public void add(Jewellery j)
 {
	/*j.setId(generateId(j));
	l.add(j);
	this.name = name;
		this.shop_name = shop_name;
		this.branch = branch;
		this.jewel_type = jewel_type;
		this.quantity = quantity;
		*/
	 try
	 {
		 int count=0;
		 Connection con=db.getDBConnection();
		 stmt=con.createStatement();
		 qry="insert into jewellery_details(name,shop_name,branch,jewel_type,quantity,id) values('"+j.getName()+"','"+j.getShop_name()+"','"+j.getBranch()+"','"+j.getJewel_type()+"','"+j.getQuantity()+"','"+j.generateId(j)+"')";
		 count = stmt.executeUpdate(qry);
		 if(count==1)
			 System.out.println("Data inserted successfully");
		 else
			 System.out.println("Data is not inserted");
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage());
	 }
 }

public void show()
 {
	/* for(Jewellery j:l)
	 {
		 System.out.println(j);
	 }*/
	try
	{
		con=db.getDBConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from jewellery_details");
		while(rs.next())
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
 }/*
 public Jewellery search(String id)
 {
	 for(int i=0;i<l.size();i++)
	 {
		 if(id.equals(l.get(i).getId()))
				 return l.get(i);
		 
	 }
	 return null;
 }*/
 public void update(Jewellery j)
 {
	/* System.out.println("Updation is done successfully");
	 show();*/
	 
	 try
	 {
		 int count=0;
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 count=stmt.executeUpdate("update jewellery_details set name='"+j.getName()+"' where id='"+j.getId()+"'");
		 if(count==1)
			 System.out.print("Updation done successfully");
		 else
			 System.out.println("Updation is not done");
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage()); 
 }
 }
 public void remove(String it)
 {
	/* for(int i=0;i<l.size();i++)
	 {
		 if(id.equals(l.get(i).getId()))
				 {
			 			l.remove(i);
				 }
	 }*/
	 try
	 {
		 int count=0;
		 con=db.getDBConnection();
		 stmt=con.createStatement();
		 qry="delete from jewellery_details where id='"+it+"'";
		 count=stmt.executeUpdate(qry);
		 if(count==1)
			 System.out.println("Deleted successfully");
		 else
			 System.out.println("Not deleted");
				
	 }
	 catch(Exception ex)
	 {
		 System.out.println(ex.getMessage());
	 }
 }
 /*
 public  String generateId(Jewellery j)
	{
		String s=((Jewellery) j).getName().toUpperCase().substring(0,2);
		String str=s+((Jewellery) j).getShop_name().toUpperCase().substring(0,3);
		return str;
		
	}*/
}

