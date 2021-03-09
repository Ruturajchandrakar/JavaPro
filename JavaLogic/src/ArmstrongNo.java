import java.util.Scanner;

public class ArmstrongNo {
	 public static void main(String[] arg){
		 int rem,sum=0,temp;
		 System.out.println("Enter no to check Armstrong no or not");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 temp=n;
		 while(n>0){
			 rem=n%10;
			 sum=sum+(rem*rem*rem);
			 n=n/10;
		 }
		if(temp == sum)
			System.out.println("Armstrong No");
		else
			System.out.println("Not Armstrong No");
	 }
}
