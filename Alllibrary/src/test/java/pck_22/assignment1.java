package pck_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class assignment1 
{
	public void ReadData() throws IOException
	{
		File f=new File("../Alllibrary/assignmentbody.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the line number: ");
		int r=s.nextInt();
		for(int i=1; i<r; i++)
		{
			b.readLine();
		}
		String line=b.readLine();
		System.out.println();
		System.out.println(line);
	}
	public static void main(String[] args) throws IOException {
		assignment1 a=new assignment1();
		a.ReadData();
	}
}
