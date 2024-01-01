package javatest.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("/Users/rajanikanttiwari/Documents/Important_new_backup_folder_wise/temp/a.txt");
  FileInputStream fileInputStream=new FileInputStream(file);
  ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
  Student std1=(Student)objectInputStream.readObject();
	System.out.println(std1.id+" "+std1.name);
	Student std2=(Student)objectInputStream.readObject();
	System.out.println(std2.id+" "+std2.name);
	Student std3=(Student)objectInputStream.readObject();
	System.out.println(std3.id+" "+std3.name);
	
	}
 
}
