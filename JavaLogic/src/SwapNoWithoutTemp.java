import java.util.Scanner;

public class SwapNoWithoutTemp {
	public static void main(String []arg){
		int a,b;
		System.out.println("Enter 1st no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter 2nd no");
		Scanner st=new Scanner(System.in);
		b=st.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: ");
		System.out.println(a);
		System.out.println(b);
	}
}
