package hwalgo02_서울_4반_이서준;

import java.util.Scanner;

public class 정올_1021_장난감_메모이제이션 {
	static int[][] map;
	static int[][] res;
	//제품을 만들기 위해 필요한 기본 부품을 계산한 결과를 저장
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		map = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();// x를 만드는데 부품 y가 ㅏk개 필요
			int y = sc.nextInt();
			int k = sc.nextInt();
			map[x][y] = k;
		}
		res = new int[N + 1][N + 1];
		
		search(N);
		for (int i = 1; i < res.length; i++) {
			if (res[N][i] != 0) {
				System.out.println(i + " " + res[N][i]);
			}
		}
	}
	
	//제품을 만들기 위해 필요한 기본 부품의 배열을 계싼해서 전역변수에 저장하는 메소드
	private static void search(int n) {
		if(res[n][0]<0) { 
			return;//계산을 이미 했다면
		}
		res[n][0]=-2;
		for (int i = 0; i < map.length; i++) {
			if (map[n][i] != 0) {
				search(i);
				if (res[i][0] == -2) {
					res[n][i] += map[n][i];
				} else {
					for(int j=0;j<map.length;j++) {
						res[n][j]+=map[n][i]*res[i][j];
					}
				}
				res[n][0] = -1;
			}
		
		}
	
	}

}
