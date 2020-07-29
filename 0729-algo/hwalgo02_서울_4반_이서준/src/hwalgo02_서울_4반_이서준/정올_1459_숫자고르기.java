package hwalgo02_서울_4반_이서준;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class 정올_1459_숫자고르기 {
	static int temp;
	static int[] visited;
	static int[] lineFirst;
	static int[] lineSecond;
	static int num=0;
	
	static ArrayList<Integer> sel = new ArrayList<Integer>();
	static ArrayList<Integer> cur = new ArrayList<Integer>();
	static ArrayList<Integer> res = new ArrayList<Integer>();


	public static void main(String[] args) {
		lineFirst = new int[100];
		lineSecond = new int[100];
		visited = new int[100];

		Scanner sc = new Scanner(System.in);

		temp = sc.nextInt();

		for (int i = 0; i < temp; i++) {
			lineFirst[i] = i;
		} // 첫줄배열완료
		for (int i = 0; i < temp; i++) {
			lineSecond[i] = sc.nextInt();
		} // 첫줄배열완료

		for (int i = 1; i < temp; i++) {
			permu(0, i);
		}
		System.out.println(num);
	}

	public static void permu(int curN,int cou) {
		if(curN==cou) {
			System.out.println("뽑기완료");
			int same=0;
			Collections.sort(sel);
			Collections.sort(cur);
			
			for(int i=0;i<cur.size();i++) {
				if(sel.get(i)!=cur.get(i)) {
					same=1;
				}
			}
			if(same==0) {
				if(num<cur.size()) {
					num=cur.size();
				}
			}
			return;//뽑음완료
		}
		for(int i=0;i<temp;i++) {
			if(visited[i]==0) {
				visited[i]=1;
				cur.add(i);//뽑은 위치를 놓는다
				sel.add(lineSecond[i]);
				System.out.println(cur.size());
				permu(curN+1,cou);
				cur.remove(i);
				sel.remove(i);
				System.out.println(cur.size());
				visited[i]=0;
			}
		}
	}
}
