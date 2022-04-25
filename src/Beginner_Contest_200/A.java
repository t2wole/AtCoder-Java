package Beginner_Contest_200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int result = ((n - 1) / 100) + 1;
		System.out.println(result);
	}
}
