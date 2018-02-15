import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Matrix {
	
	public ArrayList<Loadit>LI= new ArrayList<>();
	
	public Matrix()
	{
		for (int i=0;i<4;i++)
		{
			System.out.print("Enter Value : -> ");
			
			Scanner in = new Scanner(System.in);
			
			String getval = in.nextLine();
			
			System.out.print("Enter Number : -> ");
			
			String getnum = in.nextLine();
			
			Loadit LIU = new Loadit(getval, Integer.parseInt(getnum));
			
			LI.add(LIU);
		}
			
	}
	
	public void GetMatrix()
	{
		Collections.sort(LI,Collections.reverseOrder());
		
		for (int i=0;i<2;i++)
		{
			System.out.format("\n%s -> %s -> %s -> %s", "Value",LI.get(i).Values,"Number",LI.get(i).Numbers);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrix m = new Matrix();
		
		m.GetMatrix();
	
	}

}
