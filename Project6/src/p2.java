//백준 10870
//피보나치
//재귀
import java.util.*;
public class p2 {
	
	static int fib(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-2)+fib(n-1);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fib(n);
		System.out.println(result);
	}

}
