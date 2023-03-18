package com.example.empdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Employee {
	public static void main(String[] args) throws IOException, ClassNotFoundException,SqlException
	
	Properties psProperties=new Properties();
	
	FileInputStream f1=new FileInputStream("C:\\Users\\monty\\eclipse-workspace\\MavenProject1\\src\\main\\java\\db.properties");
	psProperties.load(f1);
	String driverString=psProperties.getProperty("driver");
	String constring=psProperties.getProperty("constring1");
	String userString=psProperties.getProperty("user");
	String passString=psProperties.getProperty("pass");
	Class.forName(driverString);
	Connection connection=DriverManager.getConnection(constring,userString,passString);
	PreparedStatement pStatement=connection.prepareStatement(INSERT_STRING);
	
	

}
