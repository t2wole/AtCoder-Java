package Beginner_Contest_200;

import java.io.*;
import java.util.*;

public class C {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		
		long[] arr = new long[200];
		
		long result = 0L;
				
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			result += arr[input % 200]++; 
		}
		System.out.println(result);
	}
}
