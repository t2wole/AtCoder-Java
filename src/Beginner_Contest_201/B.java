package Beginner_Contest_201;

import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Map<Integer, String> m = new HashMap<>();
		
		int[] list = new int[n];
		
		for(int i = 0; i < n; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			m.put(height, name);
			list[i] = height;
		}
		Arrays.sort(list);
		System.out.println(m.get(list[n - 2]));
	}
}
