//백준 10989
//카운팅 정렬
//숫자의 등장 횟수 이용
import java.io.*;

public class p5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int [n];
		int arr1[] = new int [10001];
		
			
		for(int i=0; i<n; i++) {
			
			arr[i]= Integer.parseInt(br.readLine());
			
		}
		
		for(int i=1; i<10001; i++) {
			while(arr1[i]>0) {
				sb.append(i).append("\n");
				arr1[i]--;
			}
			System.out.println(sb);
			
		}
		
		br.close();

	}

}
