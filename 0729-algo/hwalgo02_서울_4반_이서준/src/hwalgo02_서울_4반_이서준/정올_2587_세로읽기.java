package hwalgo02_서울_4반_이서준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정올_2587_세로읽기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int len=0;
		String res="";
		
		char[][] map=new char[15][15];
		
		for(int i=0;i<5;i++) {
			String temp=br.readLine();
			for(int j=0;j<temp.length();j++) {
				map[i][j]=temp.charAt(j);
			}
			if(len<temp.length()) {
				len=temp.length();
			}
		}
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(map[i][j]);
//			}
//			System.out.println();
//		}
		
	//	System.out.println("가장긴숫자는"+len);
		for(int i=0;i<len;i++) {
			String stem="";
			for(int j=0;j<5;j++) {
				if(map[j][i]!='\u0000') {//빈칸이 아닐떄 붙인다
				stem+=map[j][i];
				}
			}
			res+=stem;
		}
		
		System.out.println(res);
	}
}
