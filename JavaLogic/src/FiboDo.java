
public class FiboDo {
	public static void main(String[] args) {
		int a=0,b=1,c,count=8;
		System.out.println(a);
		System.out.println(b);
		do{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			count=count-1;
		}while(count>0);
	}

}
