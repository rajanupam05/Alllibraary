package pck_23;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class assignment3 
{
	public void ReadDataBasedUponRange() throws BiffException, IOException
	{
		File f=new File("../firstb/tabletesting.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the initial row: ");
		int start=s.nextInt();
		System.out.print("Enter the end column: ");
		int end=s.nextInt();
		int c=sh.getColumns();
		System.out.print("Result is: ");
		for(int i=0; i<c; i++)
		{
			for(int j=start; j<=end; j++)
			{
				Cell cl=sh.getCell(i, j);
				System.out.print(cl.getContents()+" ");
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		assignment3 a=new assignment3();
		a.ReadDataBasedUponRange();
	}
}
