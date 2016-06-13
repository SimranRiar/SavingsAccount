
public class savingsMethod {
	
	public static double calcSavings(double start, double addAmt, int years){
		
		double savings = 0;
		double sav = 0;
		for (int i = 0; i < years; i++){
			savings = savings + ((start+addAmt) * 12);
			start = start+addAmt;
			sav = savings;
		}
		return sav;
	}
}
