package pck_23;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xls 
{
	public void read() throws BiffException, IOException
	{
		File f=new File("../firstb/tabletesting.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet ws=w.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		for(int i=1;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell cl=ws.getCell(j, i);
				System.out.print(cl.getContents()+" ");
	////			System.out.print(" ");
			}
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		xls x=new xls();
		x.read();
	}
}
