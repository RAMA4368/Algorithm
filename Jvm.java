package programmers;

public class Jvm {

	
	static int a = 0; //전역변수 (정적) == method 영역 
	int b = 0; //전역변수 (정적) ==method 영역
	
	
	
	//함수 
	public int test(int c, int d) {//c랑 d는 매개변수니까 stack 영역 
		
		int result = 0;// 지역변수니까 stack 영역  
		result = c+d;
	
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		 Jvm jvm = new Jvm();//jvm은 클래스 변수니까 Method , new 된 객체 자체는 heap 영역에 들어감! 
		 a = jvm.test(1, 2); // 함수호출 
		 System.out.println(a);
		 
	}
}
