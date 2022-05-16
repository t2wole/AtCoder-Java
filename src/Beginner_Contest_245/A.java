package Beginner_Contest_245;

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
		int d = Integer.parseInt(st.nextToken());
		
		if(a < c) System.out.println("Takahashi");
		
		else if(a == c) {
			if(b <= d) 
				System.out.println("Takahashi");
			else 
				System.out.println("Aoki");
		}
		
		else System.out.println("Aoki");	
	}
}
