package javatest.designpattern.structural.facade;


import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection(){
		//get Oracle DB connection using connection parameters
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		System.out.println("OracleHelper="+"generateOraclePDFReport");
		//get data from table and generate pdf report
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		System.out.println("OracleHelper="+"generateOracleHTMLReport");
		//get data from table and generate pdf report
	}
	
}

