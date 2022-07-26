package AssistedProject;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Solutiontomath c1=new Solutiontomath();
		double result;
		while(true)
		{
		//Menu Driven program
		System.out.println("Enter 1. Addition  2. Subtraction  3. Mutliplication 4.Division  5.exit");
		int choice=sc.nextInt();
		
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		
		switch(choice){
			case 1 :result=c1.addition(a, b);
					System.out.println("Addition="+result);
					break;
			case 2 :result=c1.subtraction(a, b);
			       System.out.println("Subtraction="+result);
			         break;
			case 3 :result=c1.multiplicaiton(a, b);
			        System.out.println("Addition="+result);
			       break;
			case 4 : result=c1.division(a, b);
					 System.out.println("Division="+result);
					 break;
			case 5: System.exit(0);
		}
		
		}

	}
}
