import java.util.Scanner;

public class ReverseString {
	public static void main(String[] arg){
		String reverse=" ";
		System.out.println("Enter String to reverse");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Original string is: "+str);
		System.out.println("Reverse string is: "+reverse);
	}
}
