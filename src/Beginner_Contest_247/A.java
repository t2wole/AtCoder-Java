package Beginner_Contest_247;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		sb.append("0");
		
		for(int i = 0; i < 3; i++) {
			sb.append(s.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
}
