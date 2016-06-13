import java.util.Scanner;

public class savings {

	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner( System.in );
		double start;
		System.out.print("Enter initial monthly withdrawal amount:");
		start = user_input.nextDouble();
		
		double addAmt;
		System.out.print("Enter increase in monthly withdrawal every year:");
		addAmt = user_input.nextDouble();
		
		int years;
		System.out.print("Enter number of years:");
		years = user_input.nextInt();
		
		System.out.println(savingsMethod.calcSavings(start, addAmt, years));

	
	}
	
	

}
