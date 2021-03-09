import java.util.Scanner;
public class PalindromeStringOrNumber {
	public static void main(String[] arg){
		String reverse = "";
		System.out.println("Enter to check Palindrome or not");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String original=sc.nextLine();
		int no=original.length();
		for(int i=no-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println("This is Palindrome");
		}
		else{
			System.out.println("This is not Palindrome");
		}
	}
}
