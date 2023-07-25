package pck_23;

import java.io.File;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class assignment4 
{
	public void writedata() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../firstb/Assignment4.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);
		WritableSheet ws=wb.createSheet("New", 0);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of Row: ");
		int r=s.nextInt();
		System.out.print("Enter the number of column: ");
		int c=s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter the value: ");
				String input = s.next();
				Label l=new Label(j, i, input);
				ws.addCell(l);
			}
		}
		wb.write();
		wb.close();
	}
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		assignment4 a=new assignment4();
		a.writedata();
	}
}
