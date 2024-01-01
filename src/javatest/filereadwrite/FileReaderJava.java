package javatest.filereadwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava {
	public static void main(String[] args) {
		File file=new File("F:/abcde.txt");
		if(file.exists())
		{
			try {
				FileReader fileReader=new FileReader(file);
				BufferedReader bufferedReader=new BufferedReader(fileReader);
				String str=null;
				try {
					while((str=bufferedReader.readLine())!=null)
					System.out.println(str);
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
