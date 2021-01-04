//¹éÁØ 10872
//ÆÑÅä¸®¾ó
//Àç±Í

import java.util.*;

public class p1 {

	static int fact(int n) {
		
		if(n==0)
			return 1;
		else if(n==1)
			return 1;
		else
			return fact(n-1)*n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = fact(n);
		
		System.out.println(result);
	}

}
