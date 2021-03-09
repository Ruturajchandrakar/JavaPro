public class FiboRecursion {
	static int a=0,b=1,c;
	static void printFibo(int count){
		if(count>0){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printFibo(count-1);
		}
	}
	public static void main(String[] arg){
		int count=10;
		System.out.println(a);
		System.out.println(b);
		printFibo(count-2);
	}
}
