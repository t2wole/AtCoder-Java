package Beginner_Contest_234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int result = func(func(func(t) + t) + func(func(t)));
		System.out.println(result);
	}
	
	public static int func(int t) {
		return(t * t + 2 * t + 3);
	}
}
