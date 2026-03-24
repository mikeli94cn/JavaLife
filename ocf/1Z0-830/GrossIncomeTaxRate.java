import java.util.*;

class GrossIncomeTaxRate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double grossIncome=sc.nextDouble();
		/* option A
		double taxRate=grossIncome <= 1800 ? 0 : (grossIncome <= 36000) ? .1 :.2;
		*/
		
		/* option B
		double taxRate=.2;
		taxRate=grossIncome <= 18000 ? 0 : .1;
		taxRate=grossIncome <= 36000 ? .1 : .2;
		*/

		double taxRate=0;
		if(grossIncome > 36000)
			taxRate=.2;
		if(grossIncome > 18000 && grossIncome <= 36000)
			taxRate=.1;

		System.out.println(taxRate);
		sc.close();
	}
}
