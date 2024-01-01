package javatest.filereadwrite;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file=new File("abc.ser");
	FileInputStream fileInputStream=new FileInputStream(file); 
	ObjectInputStream ois=new ObjectInputStream(fileInputStream);
	Student st=(Student)ois.readObject();
	System.out.println("Object Write On File SuccessFully");
	System.out.println(st.getId()+" "+st.getName()+" "+st.getAddress());
	ois.close();
}
}