package Beginner_Contest_246;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int ans_x = 0;
		int ans_y = 0;
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			ans_x ^= x;
			ans_y ^= y;
		}
		
		System.out.println(String.format("%d %d", ans_x, ans_y));
	}
}
