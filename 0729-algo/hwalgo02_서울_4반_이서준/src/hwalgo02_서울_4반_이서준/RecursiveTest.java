package hwalgo02_서울_4반_이서준;

public class RecursiveTest {
	
	public static int f4(int i) {
		if(i==1) {
			return 1;
		}else {
			return f4(i-1)+i;
		}
	}
	public static void main(String[] args) {
		int res= f4(6);
	}
}
