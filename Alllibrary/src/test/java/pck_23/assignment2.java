package pck_23;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class assignment2 
{
	public void ReadDaataBasedUponRowno() throws BiffException, IOException
	{
		File f=new File("../firstb/tabletesting.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int c=sh.getColumns();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Row: ");
		int r=s.nextInt();
		System.out.print("Result is: ");
		for(int i=0; i<c; i++)
		{
			Cell cl=sh.getCell(i, r);
			System.out.print(cl.getContents()+" ");
		}
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		assignment2 a=new assignment2();
		a.ReadDaataBasedUponRowno();
	}
}
