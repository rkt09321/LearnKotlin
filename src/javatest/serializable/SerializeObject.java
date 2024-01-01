package javatest.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {
  public static void main(String[] args) throws IOException {
	Student student1=new Student(50, "Rajani Kant Tiwari");
	Student student2=new Student(100, "Radha Kant Tiwari");
	Student student3=new Student(150, "Mohan Kant Tiwari");
	
	File file=new File("/Users/rajanikanttiwar/Documents/abc.txt");
	if(!file.exists())
	{
		file.createNewFile();
	}
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream); 
	objectOutputStream.writeObject(student1);
	objectOutputStream.writeObject(student2);
	objectOutputStream.writeObject(student3);
	objectOutputStream.flush();
	objectOutputStream.close();
	System.out.println("Object Write SuccessFully");
}
}
