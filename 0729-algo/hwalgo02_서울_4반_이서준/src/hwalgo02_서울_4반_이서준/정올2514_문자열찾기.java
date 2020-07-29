package hwalgo02_서울_4반_이서준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 
 * indexof를 이용해도 됩니다
 * 
 * 
 * 
 * */

public class 정올2514_문자열찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		int res1 = 0;
		int res2 = 0;

		temp = br.readLine();

		for(int i=0;i<temp.length();i++) {
			
		}
		
		System.out.println(res1);
		System.out.println(res2);
	}
}


//public class 정올2514_문자열찾기 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String temp;
//		int res1 = 0;
//		int res2 = 0;
//
//		temp = br.readLine();
//
//		for (int i = 0; i < temp.length() - 2; i++) {
//			String tar;
//			tar = temp.substring(i, i + 3);
//		//	System.out.println("문자열 추춫"+tar);
//			if (tar.equals("KOI")) {
//				res1++;
//			}
//			if (tar.equals("IOI")) {
//				res2++;
//			}
//		}
//		
//		System.out.println(res1);
//		System.out.println(res2);
//	}
//}
