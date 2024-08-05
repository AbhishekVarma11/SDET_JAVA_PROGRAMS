package SDET_Java_Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations2 {
	public static void main(String args[]) throws IOException
	{
		FileWriter fout=new FileWriter("D://books-links2.txt");
		BufferedWriter bout=new BufferedWriter(fout);
		bout.write("abhi is the good boy");
		bout.flush();
		FileReader fin=new FileReader("D://books-links2.txt");
		BufferedReader bin=new BufferedReader(fin);
		String ch=bin.readLine();
		while(ch!=null)
		{
			System.out.println(ch);
			ch=bin.readLine();
			
		}
	}

}
