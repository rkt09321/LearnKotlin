package javatest.oopsconcept;

import java.sql.SQLException;


public class ExceptionChildTesting extends ExceptionTesting {
	public ExceptionChildTesting test() throws SQLException
	{
		ExceptionChildTesting exceptionChildTesting=new ExceptionChildTesting();
		System.out.println("Test");
		return exceptionChildTesting;
	}
}
