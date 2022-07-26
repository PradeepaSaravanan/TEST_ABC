package AssistedProject;

public class Solutiontomath implements Mathematis{

	@Override
	public double addition(double num1, double num2) {
             double result=0;//local variable
		
		result=num1+num2;
		return result;
	}

	@Override
	public double subtraction(double num1, double num2) {
		 double result=0;//local variable
			
			result=num1-num2;
			return result;
	}

	@Override
	public double multiplicaiton(double num1, double num2) {
		double result=0;
		if(num2!=0 && num1!=0)
			result=num1*num2;
		
		return result;
	}

	@Override
	public double division(double num1, double num2) {
		double result=0;
		if(num2>0)
			result=num1/num2;
		
		return result;
	}

}
