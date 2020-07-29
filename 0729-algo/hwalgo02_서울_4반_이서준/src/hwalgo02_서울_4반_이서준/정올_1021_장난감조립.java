package hwalgo02_서울_4반_이서준;

import java.util.Scanner;

/*
 * 메모리제이션
 * 
 * */
public class 정올_1021_장난감조립 {//중복의 문제
	static int[][] map;

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
		int[] res = search(N);
		for (int i = 1; i < res.length; i++) {
			if (res[i] != 0) {
				System.out.println(i + " " + res[i]);
			}
		}
	}

	/*
	 * 필요한 기본 부품의 배열을 리턴하는 메소그 0은 계산안한상태 -1:중간부품 -2:기본부품
	 * 
	 */
	private static int[] search(int n) {
		int[] res = new int[map.length + 1];
		res[0] = -2;
		for (int i = 0; i < map.length; i++) {
			if (map[n][i] != 0) {
				int[] val = search(i);
				if (val[0] == -2) {
					res[i] += map[n][i];
				} else {
					for(int j=0;j<val.length;j++) {
						res[j]+=map[n][i]*val[j];
					}
				}
				res[0] = -1;
			}
		
		}
		return res;
	}

}
