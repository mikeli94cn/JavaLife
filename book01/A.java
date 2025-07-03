package book01;
public class A{
	public static void main(String[] args){
		if(args==null || args.length==0){
			System.out.println("no argument pass!");
			return;
		} 
		for(int i=0;i<args.length;i++){
			System.out.print(args[i]+" ");
		}
		System.out.println();
	}
}
