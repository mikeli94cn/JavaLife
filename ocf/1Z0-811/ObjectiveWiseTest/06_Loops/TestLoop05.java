class TestLoop{
	public static void main(String[] args){
		int counter=0;
		outer: for(int i=0;i<3;i++)
		   middle: for(int j=0;j<3;j++)
			   inner: for(int k=0;k<3;k++)
			   {
				   if(k-j>0)
					   break middle;
				   counter++;
			   }
	   	System.out.println(counter);
	}
}
/*
i	j	k	counter
0	0	0	0
0	0	0	1
0	0	1	1
1	0	0	2
1	0	1	2
2	0	0	3
2	0	1	3
*/
