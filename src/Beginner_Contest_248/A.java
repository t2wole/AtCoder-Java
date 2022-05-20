package Beginner_Contest_248;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int sum = 45;
		
		for(int i = 0; i < str.length(); i++) {
			sum -= str.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
	}

}
