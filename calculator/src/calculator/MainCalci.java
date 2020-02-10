package calculator;

public class MainCalci {

	public double sum(double a,double b) {
		return a+b;
	}
	public double sub(double a,double b) {
		return a-b;
	}
	public double mul(double a,double b) {
		return a*b;
	}
	public double div(double a,double b) {
		
		try {
			return a/b;
		}
		catch(Exception e)
		{
			System.out.println("Denominator should not be zero");
		}
		return 0;
	}
	
}
