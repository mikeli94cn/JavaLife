public class Operator{
	public static void main(String[] args){
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("a+b="+c);

		int a1=200;
		int b1=100;
		int c1=a1-b1;
		System.out.println("a1-b1="+c1);

		int a2=2;
		int b2=3;
		int c2=a2*b2;
		System.out.println("a2*b2="+c2);

		int a3=6;
		int b3=3;
		int c3=a3/b3;
		System.out.println("a3/b3="+c3);

		int a4=6;
		int b4=4;
		int c4=a4/b4;
		System.out.println("a4/b4="+c4);
		/*
		int a5=6;
		double b5=3.1;
		int c5=a5/b5;
		System.out.println("a5/b5="+c5);
		*/
		double a6=6;
		double b6=4;
		double c6=a6/b6;
		System.out.println("a6/b6="+c6);

		int a7=6;
		int b7=4;
		int c7=a7%b7;
		System.out.println("a7%b7="+c7);

		int a8=0;
		a8=a8+1;
		System.out.println("a8="+a8);
	
		int a9=0;
		int b9=++a9;
		System.out.println("a9="+a9);
		System.out.println("b9="+b9);

		int a10=0;
		int b10=a10++;
		System.out.println("a10="+a10);
		System.out.println("b10="+b10);

		int a11=0;
		a11++;
		System.out.println("a11++="+a11++);
		System.out.println("a11="+a11);

		int z=0;
		z+=2;
		System.out.println("z="+z);

		int y=3;
		y-=1;
		System.out.println("y="+y);

		int x=4;
		x*=2;
		System.out.println("x="+x);

		int w=5;
		w/=2;
		System.out.println("w="+w);

		int v=6;
		v%=2;
		System.out.println("v="+v);

		boolean f1=5>3;
		System.out.println("f1="+f1);

		boolean f2=5>=3;
		System.out.println("f2="+f2);

		boolean f3=5<=3;
		System.out.println("f3="+f3);

		boolean f4=5!=0;
		System.out.println("f4="+f4);

		boolean f5=5==3;
		System.out.println("f5="+f5);

		boolean t=5>3 && 2>0;
		System.out.println("t="+t);

		boolean t2=5<3 && 2>0;
		System.out.println("t2="+t2);
		
		int i1=0;
		boolean t3=5<3 && ++i1>0;
		System.out.println("t3="+t3);
		System.out.println("i1="+i1);

		int i4=0;
		boolean t4=5>3 && i4++>0;
		System.out.println("t4="+t4);
		System.out.println("i4="+i4);

		int i5=0;
		boolean t5=5>3 ||i5++>0;
		System.out.println("t5="+t5);
		System.out.println("i5="+i5);

		int i6=0;
		boolean t6 = 5<3 || i6++>0;
		System.out.println("t6="+t6);
		System.out.println("i6="+i6);

		int i7=0;
		boolean t7= 5<3 & i7++>0;
		System.out.println("t7="+t7);
		System.out.println("i7="+i7);

		int i8=0;
		boolean t8=5>3 | i8++>0;
		System.out.println("t8="+t8);
		System.out.println("i8="+i8);

		boolean t9=true;
		System.out.println("!t9="+!t9);

		/*
		byte i_1=21;
		byte i_rev=~i_1;
		System.out.println("i_rev="+i_rev);
		*/

		int b_2=5;
		int b_res=b_2>>1;
		System.out.println("b_res="+b_res);
		
		int num=5>3 ? 1 : 0;
		System.out.println("num="+num);
	}
}
