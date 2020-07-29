package hwalgo02_서울_4반_이서준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swea_달팽이숫자 {
	static int a,tc;
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		tc= br.readLine().charAt(0) - '0';
	
		int cx, cy, dir;
		cx = 0;cy = 0;dir = 0;

		for (int k = 0; k < tc; k++) {
			
		a = br.readLine().charAt(0) - '0';
		int[][] map = new int[a][a];
		int[][] visited = new int[a][a];
		cx = 0;cy = 0;dir = 0;
		for (int i = 1; i <= (a * a); i++) {
			//System.out.println("22인덱스"+cx+cy);
			if (cx < 0 || cx >= a || cy < 0 || cy >= a) {
				cx -= dx[dir];
				cy -= dy[dir];
				dir++;// 방향바꾸고
				dir=dir%4;
				i--;
			} else {
				if (visited[cx][cy] == 0) {
					map[cx][cy] = i;
					visited[cx][cy] = 1;
				} else if (visited[cx][cy] == 1) {
					cx -= dx[dir];
					cy -= dy[dir];
					dir++;// 방향바꾸고
					dir=dir%4;
					i--;
				}
			}
			//System.out.println("인덱스"+cx+cy);
			cx += dx[dir];
			cy += dy[dir];
		}
		System.out.println("#"+(k+1));
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print(map[i][j]);
				if(j!=a-1) {
				System.out.print(" ");
			}}
			System.out.println();
			}
		}
	}
}
