package Beginner_Contest_251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		while(sb.length() < 6)
			sb.append(s);
		System.out.println(sb);
	}
}
