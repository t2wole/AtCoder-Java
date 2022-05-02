package Beginner_Contest_206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ans = "";
		
		int n = Integer.parseInt(br.readLine());
		
		int result = (int)Math.floor(n * 1.08);
		
		if(result < 206)
			ans = "Yay!";
		else if(result == 206) 
			ans = "so-so";
		else
			ans = ":(";
		
		System.out.println(ans);
	}
}
