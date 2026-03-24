import java.util.Scanner;

public class ConditionalTest{
	public static void main(String[] args){
		String bulletin="""
		grossIncome<18000, taxRate=0;
		18000<grossIncome<36000, taxRate=.1;
		36000<grossIncome, taxRate=.2;
			""";
		System.out.println(bulletin);

		double grossIncome;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter grossIncome:\n");
		grossIncome=sc.nextDouble();

		//double taxRate=calcTaxRateA(grossIncome);
		//double taxRate=calcTaxRateB(grossIncome);
		double taxRate=calcTaxRateC(grossIncome);

		System.out.printf("grossIncome is %f ,taxRate is %f\n",grossIncome,taxRate);
		
		sc.close();

	}
	
	private static double calcTaxRateA(double grossIncome){
		double taxRate=grossIncome<18000 ? 0 : (grossIncome<=36000) ? .1 : .2;
		return taxRate;
	}

	private static double calcTaxRateB(double grossIncome){
		double taxRate=0.2;
		if(grossIncome<36000)
			taxRate=0.1;
		if(grossIncome<18000)
			taxRate=0;
		return taxRate;
	}

	private static double calcTaxRateC(double grossIncome){
		double taxRate=grossIncome > 18000 ? grossIncome < 36000 ? 0.1 : 0.2 : 0;
		return taxRate;
	}
}
