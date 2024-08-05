package SDET_Java_Programs;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOpertions {
	public static void main(String args[]) throws IOException {
		File f=new File("D://books-links2.txt");
		FileInputStream fileObj=new FileInputStream(f);
		FileOutputStream fout=new FileOutputStream(f);
		BufferedInputStream b=new BufferedInputStream(fileObj);
		
		int ch=fileObj.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);			
			ch=fileObj.read();
		}
		
		
	}

}
