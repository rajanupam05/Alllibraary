package pck_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment5 
{
	public void file1() throws IOException
	{
		File f=new File("../Alllibrary/assignmentbody.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String a;
		while((a=br.readLine())!=null)
		{
			System.out.println(a);
		}
	}
	public void file2() throws IOException
	{
		File f=new File("../Alllibrary/assignment.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		Scanner s=new Scanner(System.in);
		System.out.print("Initial: ");
		int r=s.nextInt();
		System.out.print("End: ");
		int c=s.nextInt();
		System.out.println("Enter the sentences: ");
		for(int i=0;i<c-1;i++)
		{
			if(i<r-3)
			{
				bw.newLine();
			}
			else
			{
				String input=s.nextLine();
				bw.newLine();
				bw.write(input);
			}
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		assignment5 a=new assignment5();
		a.file1();
		a.file2();
	}
}
