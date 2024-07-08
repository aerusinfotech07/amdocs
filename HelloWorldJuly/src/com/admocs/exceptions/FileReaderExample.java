package com.admocs.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
		 fr=new FileReader(new File("c:\\training\\file.txt"));
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Please Copy File to proper location");
			//throw ex;
		}
		catch(IOException ex)
		{
			System.out.println("May Be file Got Currected");
			
		}
		catch (Exception e) {
			System.out.println("I will manage please leave");
		}
		finally {
			try {
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Programme completed");
		}
		

	}

}
