package com.example.empdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

public class Emp {
	final static String INSERT_STRING="insert into tblemp(id,name,city,salary) values(?,?,?,?)";
public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	Properties psProperties=new Properties();
	
	try {
		FileInputStream f1=new FileInputStream("C:\\Users\\monty\\eclipse-workspace\\MavenProject1\\src\\main\\java\\db.properties");
		psProperties.load(f1);
		String driverString=psProperties.getProperty("driver");
		String conString=psProperties.getProperty("constring");
		String userString=psProperties.getProperty("user");
		String paString=psProperties.getProperty("pass");
		Class.forName(driverString);
		Connection connection=DriverManager.getConnection(conString,userString,paString);
		PreparedStatement pStatement=connection.prepareStatement(INSERT_STRING);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter id");
		int id=s1.nextInt();
		System.out.println("Enter Name");
		String nameString=s1.next();
		System.out.println("Enter City");
		String cityString=s1.next();
		System.out.println("Enter Salary");
		float sal=s1.nextFloat();
		System.out.println("Connected!!");
		
		PreparedStatement pStatement1=connection.prepareStatement(INSERT_STRING);
		pStatement1.setInt(1, id);
		pStatement1.setString(2, nameString);
		pStatement1.setString(3, cityString);
		pStatement1.setFloat(4, sal);
		
		pStatement1.executeUpdate();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (InputMismatchException e) {
		// TODO: handle exception
	System.out.println("I/P mismatch");
	}
}
}