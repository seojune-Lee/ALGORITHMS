package hwalgo02_서울_4반_이서준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import sun.applet.Main;

public class SWEA2805_농작물 {

	static int t, n;
	static int[][] map;
	static int res;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		

		Scanner sc = new Scanner(System.in);
		

		for (int a = 0; a < t; a++) {
			n = Integer.parseInt(br.readLine());
			map = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < n; j++) {
					map[i][j] = s.charAt(j) - '0';// 캐릭터로 받아 정수형변환

				}
			}
//			sc.nextLine();

//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}

			int cx, cy;
			cx = n / 2;
			cy = n / 2;
			int k = 0;
//
			//System.out.println("중점" + cx + cy);

			// 다이아몬드 상단
			for (int i = cx - (n / 2); i <= cx; i++) {
				for (int j = cy - k; j <= cy + k; j++) {
				//	System.out.print("인덱스" + i + j);
					res += map[i][j];

				}
				k++;
			}
			// System.out.println("상단완료");
			k-=2;
			
			for (int i = cx + 1; i <= cx + n / 2; i++) {
				for (int j = cy - k; j <= cy + k; j++) {
					// System.out.print("인덱스"+i+j);
					res += map[i][j];
				}
				k--;
			}
			// 다이아몬드 검사
			System.out.println("#"+(a+1)+" "+res);
			k=0;res=0;
		}
	}
}
