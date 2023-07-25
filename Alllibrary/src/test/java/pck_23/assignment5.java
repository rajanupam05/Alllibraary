package pck_23;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class assignment5 
{
	public void readdata() throws BiffException, IOException
	{
		File f=new File("../firstb/readable.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet sh=wb.getSheet(0);
		int r=sh.getRows();
		int c=sh.getColumns();
		System.out.println("## Readable Data ##");
		System.out.println();
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				Cell cl=sh.getCell(j, i);
				System.out.print(cl.getContents()+" ");
			}
		}
	}
	public void writedata() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../firstb/writableable.xls");
		WritableWorkbook cwb=Workbook.createWorkbook(f);
		WritableSheet csh=cwb.createSheet("write", 0);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("## Writing of readable data in another XLS file ##");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r=s.nextInt();
		System.out.print("Enter the number of column: ");
		int c=s.nextInt();
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("Enter the value: ");
				String input=s.next();
				Label L=new Label(j, i, input);
				csh.addCell(L);
			}
		}
		cwb.write();
		cwb.close();
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		assignment5 a=new assignment5();
		a.readdata();
		a.writedata();
	}
}
