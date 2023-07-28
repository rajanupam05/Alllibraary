package pck_22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class assignment2 
{
	public void readdataofrange() throws IOException
	{
		File f=new File("../Alllibrary/assignmentbody.txt");
		BufferedReader b=new BufferedReader(new FileReader(f));
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the START of range: ");
		int r=s.nextInt();
		System.out.print("Enter the END of range: ");
		int c=s.nextInt();
		System.out.println();
		for(int i=r;i<=c;i++)
		{
			System.out.println(b.readLine());
		}
	}
	public static void main(String[] args) throws IOException {
		assignment2 a=new assignment2();
		a.readdataofrange();
	}
}
