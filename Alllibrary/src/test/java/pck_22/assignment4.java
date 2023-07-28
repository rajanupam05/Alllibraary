package pck_22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class assignment4 
{
	public void writedatainaRange() throws IOException
	{
		File f=new File("../Alllibrary/assignment.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		Scanner s=new Scanner(System.in);
		System.out.print("initial row count: ");
		int r=s.nextInt();
		System.out.print("end row count: ");
		int c=s.nextInt();
		System.out.println("Enter the sentence: ");
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
		assignment4 a=new assignment4();
		a.writedatainaRange();
	}
}
