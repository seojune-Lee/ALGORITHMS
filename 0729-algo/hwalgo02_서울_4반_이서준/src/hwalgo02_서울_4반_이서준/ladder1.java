package hwalgo02_서울_4반_이서준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ladder1 {
	static int height=0;
	public static void main(String[] args) throws IOException {
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String temp;
	temp=br.readLine();
	
	for(int i=0 ; i<temp.length(); i++) {
	
		if(i!=0) {
			if(temp.charAt(i)!=temp.charAt(i-1)) {
				height+=10;
			}else {
				height+=5;
			}
		}
		
	}
	System.out.println((height+10));
		
		
	}
}
