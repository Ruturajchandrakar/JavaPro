import java.util.Scanner;

public class PalindromNo {
	public static void main(String[] arg){
		int rem,temp,sum=0;
		System.out.println("Enter no to check prime or not");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		temp=no;
		while(no>0){
			rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		if(temp==sum){
			System.out.println("No  is Palindrom no");
		}
		else{
			System.out.println("No is not Palindrom no");
		}
	}
}
