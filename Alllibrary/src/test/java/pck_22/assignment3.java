package pck_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment3 
{
	public void writedata() throws IOException
	{
		File f=new File("../Alllibrary/assignment.txt");
		BufferedWriter b=new BufferedWriter(new FileWriter(f));
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of line need: ");
		int r=s.nextInt();
		System.out.println();
		System.out.println("Enter the line need to enter: ");
		for(int i=1; i<=r; i++)
		{
			String input=s.nextLine();
			b.write(input);
			b.newLine();
		}
		b.close();
		System.out.println();
		System.out.println("## Result ##");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String a;
		while((a=br.readLine())!=null)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) throws IOException {
		assignment3 a=new assignment3();
		a.writedata();
	}
}
