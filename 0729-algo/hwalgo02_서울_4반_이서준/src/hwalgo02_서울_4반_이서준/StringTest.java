package hwalgo02_서울_4반_이서준;

import java.util.Arrays;
import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;

public class StringTest {
	String s1="abc";//스트링클래스만 기본형 타입처럼 객체생성할 수 있도록 허용
	String s2="abc";//스트링클래스만 기본형 타입처럼 객체생성할 수 있도록 허용
	
	//속도를 빠르게 하기 위해서 상수풀에 넣는다
	
	String s3=  new String("abc");
	String s4=  new String("abc");
	public static String temp;//전역변수는 기본값이 들어갑니다
	public static void main(String[] args) {
		
		String s8="abcdefg";//value메소드는 private러 encapsulaltion이 되어 있습니다
		//각메소드들은 Strin 클래스의 원본을 변경하지 않는다
		System.out.println(s8.charAt(1));//해당위치의 인덱스를 가져와라
		System.out.println(s8.concat("xyz"));
		System.out.println(s8.indexOf("def"+"문자열이 발견된 인덱스 반환"));//
		System.out.println(s8.contains("def"+"포함여부"));
		System.out.println(s8.substring(2,6));
		System.out.println(s8.replace("abx", "ttttttttttt"));
		
		String ss="\t   \n tiger   cat";
		System.out.println(ss.trim()+"  앞뒤 문자열 제거 ");
		
		
		String s10="호랑이,사자,귤,우유,바나나";
		String[] srr=s10.split(",");//구분자를 기준으로 쪼개짐//정규화표현식ㅇ해석을 하기 떄문에
		System.out.println(Arrays.toString(srr));
		System.out.println(srr[0]);//배열로저장
		System.out.println(srr.length);
		
		StringTokenizer st=new StringTokenizer(s10,",");
		System.out.println(st.countTokens()+"쪼갠문자열의 갯수");
		System.out.println(st.hasMoreTokens()+"사용하지 않은 토큰이 남아있는지");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	
		System.out.println();
		
		//String te,p
 	}
	
	//s1==s2==>true
	//s3==s4==>false
		
}
