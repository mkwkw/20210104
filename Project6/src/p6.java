//백준 2108
//정렬

import java.io.*;
import java.util.*;
public class p6 {
	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		int num[] = new int [8001];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			
		}
		br.close();
		
		Arrays.sort(arr);
		
		double sum = 0;
		int avg = 0;
		int med = 0;
		int freq = 0;
		
		int large = -4000;
		int small = 4000;
		int range = 0;
		
		for(int i=0; i<8001; i++) {
			num[i]=0;
		}
		
		for(int i=0; i<n; i++) {
			sum+=arr[i];
			if(arr[i]>=0)
				num[arr[i]]++;
			else
				num[4000+Math.abs(arr[i])]++;
			
			if(large<arr[i])
				large = arr[i];
			if(small>arr[i])
				small = arr[i];
		}
		
		avg = (int)Math.round(sum/n);
		med = arr[n/2];
		range = large-small;
		
		
		
		for(int i=0; i<8001; i++) {
			if(num[i]>freq) {
				freq=i;
				
			}
			else
				continue;
		}
		
		if(freq>4000)
			freq=(freq-4000)*(-1);
		
		System.out.println(avg);
		System.out.println(med);
		System.out.println(freq);
		System.out.println(range);

	}

}
