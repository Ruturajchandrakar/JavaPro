import java.util.Scanner;
public class FactorialRecursion {
	static int findFact(int n){
		if(n==0)
			return 1;
		else
		return(n * findFact(n-1));
	}
	public static void main(String[] arg){
		int n,fact=1;
		System.out.println("Enter no to find Factorial");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		fact=findFact(n);
		System.out.println("Factorial of no is "+fact);
	}
}