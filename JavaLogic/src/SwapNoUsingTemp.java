import java.util.Scanner;

public class SwapNoUsingTemp {
	public static void main(String[] arg){
		int temp;
		System.out.println("Enter 1st no");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter 2nd no");
		Scanner st=new Scanner(System.in);
		int y=st.nextInt();
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping");
		System.out.println(x);
		System.out.println(y);
	}
}
