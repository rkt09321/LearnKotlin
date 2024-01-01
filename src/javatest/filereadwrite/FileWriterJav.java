package javatest.filereadwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterJav {
	int x;
	public static void main(String args[])
	{   
		Scanner sc=new Scanner(System.in);
		String location="F:/abcde.txt";
		File file=new File(location);
		System.out.println("Write data on File");
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 /*       InputStreamReader inputStreamReader=new InputStreamReader(System.in);
	    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
*/
	    try {
			FileWriter fileWriter=new FileWriter(file,true);
			fileWriter.write(sc.nextLine());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
