package Beginner_Contest_200;

import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < k; i++) {
			if(n % 200 == 0) {
				n /= 200;
			}
			else { 
				n = (n * 1000) + 200;
			}
		}
		System.out.println(n);
	}
}
