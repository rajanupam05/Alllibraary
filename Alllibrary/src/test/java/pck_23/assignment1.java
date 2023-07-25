package pck_23;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//// keep in mind java understand the cell intitalize from (0,0)
public class assignment1 
{
	public void readdatabaseduponrownoandcolumnno() throws BiffException, IOException
	{
		File f=new File("../firstb/tabletesting.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s=wb.getSheet(0);
		///int r=s.getRows();
		///int c=s.getColumns();
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the Row: ");
		int r=ob.nextInt();
		System.out.print("Enter the column: ");
		int c=ob.nextInt();
		Cell cl=s.getCell(c,r);		//standard cell representation (column,row)
		System.out.println("Result is: "+cl.getContents());

	}
	public static void main(String[] args) throws BiffException, IOException {
		assignment1 a=new assignment1();
		a.readdatabaseduponrownoandcolumnno();
	}
}
