package calculator;
import java.util.*;

public class SimpCalci extends MainCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b;
		String c;
		MainCalci calc=new MainCalci();
		Scanner sc=new Scanner(System.in);
		int d;
		boolean isTrue=true;
		while(isTrue)
		{
		System.out.print("Enter the First Number:");
		a=sc.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number:");
		b=sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Operation: + or - or * or / :");
		c=sc.next();
		System.out.println();
		
		
		try
		{
			switch(c)
			{
			case "+" : System.out.println("The Sum of the above 2 numbers is: "+ calc.sum(a,b));
					   
			System.out.print("Do you want to continue?(0/1):");
			d=sc.nextInt();
			System.out.println();
					   
					   if(d==0)
					   {
						   isTrue=false;
						   break;
					   }
					   else
					   {
						   isTrue=true;
						   break;
					   }
					  
			case "-" : System.out.println("The Subtraction of the above 2 numbers is: "+ calc.sub(a,b));
			
			System.out.print("Do you want to continue?(0/1):");
			d=sc.nextInt();
			System.out.println();
			   if(d==0)
			   {
				   isTrue=false;
				   break;
			   }
			   else
			   {
				   isTrue=true;
				   break;
			   }
			case "*" : System.out.println("The Multipliation of the above 2 numbers is: "+ calc.mul(a,b));
			System.out.print("Do you want to continue?(0/1):");
			d=sc.nextInt();
			System.out.println();
			   if(d==0)
			   {
				   isTrue=false;
				   break;
			   }
			   else
			   {
				   isTrue=true;
				   break;
			   }
			case "/" : System.out.println("The Division of the above 2 numbers is: "+ calc.div(a,b));
			  
			System.out.print("Do you want to continue?(0/1):");
			d=sc.nextInt();
			System.out.println();
			   if(d==0)
			   {
				   isTrue=false;
				   break;
			   }
			   else
			   {
				   isTrue=true;
				   break;
			   }
			
			
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter correct operation");
		}
//		sc.close();
		
		}
sc.close();
	}

}
