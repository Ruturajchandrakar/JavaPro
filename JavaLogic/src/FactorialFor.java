import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] arg){
		int no,fact=1;
		System.out.println("Enter no for factorial");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(int i=1;i<=no;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
