import java.util.*;

class TestClass{
	public static void main(String[] args){
		double ran1=Math.random();
		System.out.println(ran1);
		
		String uuid=UUID.randomUUID().toString();
		System.out.println(uuid);

		Random rand=new Random();
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(100));
		System.out.println(rand.nextLong());

		System.out.println(rand.nextDouble());
		System.out.println(rand.nextGaussian());
	}
}
