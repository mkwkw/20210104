//백준 4344
//평균 구하기
//평균 넘는 비율 구하기

import java.util.*;
public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int sum = 0;
			double avg = 0;
			int student = 0;
			double result = 0;
			
			
			int arr[] = new int [1001];
			int m =sc.nextInt();
			
			for(int j=0; j<m; j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			System.out.println(sum);
			avg = (double)sum/m;
			System.out.println(avg);
			
			for(int j=0; j<m; j++) {
				if(arr[j]>avg)
					student++;
				else
					continue;
			}
			
			result = (double)student/m*100;
			
			System.out.printf("%5.3f",result);
			System.out.println("%");
		}
		
		sc.close();
		
	}

}
