package javatest.filereadwrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
public static void main(String[] args) throws IOException {
	File file=new File("abc.ser");
	if(!file.exists())
		file.createNewFile();
	FileOutputStream fileInputStream=new FileOutputStream(file); 
	ObjectOutputStream oos=new ObjectOutputStream(fileInputStream);
	Student st=new Student();
	st.setId(1);
	st.setName("Rajani Kant Tiwari");
	st.setAddress("New Ashok Nagar");
	oos.writeObject(st);
	System.out.println("Object Write On File SuccessFully");
	oos.close();
}
}
