package Beginner_Contest_203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a == b && b == c) 
			System.out.println(a);
		else if(a == b) 
			System.out.println(c);
		else if(b == c)
			System.out.println(a);
		else if(c == a)
			System.out.println(b);
		else
			System.out.println(0);
	}
}
