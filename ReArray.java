package programmers;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/* 
 * 1) a를 배열에 넣자
 	2) b도 배열에 넣자 
 	2-1) c는 첫째자리수가 a의 배열중 가장 크면서 b의 첫째자리 수보다 작아야한다.
 	3) 첫째자리수는 b의 [0]번째 있는 친구랑 같거나 작아야 한다.
 	4) 둘째자리수는 만약에 b의 [0]번째 있는 친구보다 작았다면 아무수나 상관없다
 	5) 둘째자리수는 만약 b의 [0]번째 있는 친구랑 같았다면 [1]번째 있는 수는 같거나 작아야 한다
 	6) 셋째자리수는 만약 b의 [0]번째 있는 친구랑
 	7) a의 배열중 b의 배열에 들어있는 숫자와 비교했을 때 [0] 에 들어있는 수보다 작거나 같은수가 없다면 -1 로 출력한다.   
*/



public class ReArray {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("a를 입력하세요");
		String a =sc.next();  
		System.out.println("b를 입력하세요");
		String b=sc.next();
		System.out.println("a.length::" + a.length());
		int [] A = new int[a.length()];
		int [] B = new int[b.length()];
		int [] C =new int[a.length()];
		int [] result= new int[a.length()];//C의 결과값
		int max = C[0];
		int max1 = A[0];
		int max2 = A[0];
		int max3 = A[0];
		for(int i=0;i<a.length();i++) {
			A[i] = a.charAt(i) - '0'; //아스키코드로 0이 48이다. 
		}

		for(int i=0; i<A.length;i++) {
			System.out.println("A["+i+"]=" + A[i]);
		}
		
		for(int i=0;i<B.length;i++) {
			B[i] = b.charAt(i) - '0';
		}
		for(int i=0; i<B.length;i++) {
			System.out.println("B["+i+"]=" + B[i]);
		}
		
		//A[]랑 B[]랑 비교해야한다. 비교해서 B[] 안의 수보다 A[]의 수가 작아야한다.  
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<1;j++) {
				if(A[i]<=B[j]) {
					System.out.println("C의 첫번째 자리 수는 :: " + A[i] +"얘로해도되요");
					C[i]=A[i];
					
				}
			}
		}
		for(int k=0;k<C.length;k++) {
			System.out.println("C["+k+"]=" + C[k]);
			if(C[k]>=max) {//C[k]에 값이 있으면 조건을 만족하는 수 중 가장 큰 값을 첫째자리에 넣는다. 
				max = C[k];
			}
		}
		System.out.println("Max = " + max);
		result[0] = max;
		
		
		//result[0] 이 B[0]보다 작거나 같으면 result[1]번째 친구는  A배열중 가장 큰수   
		if(result[0]<=B[0]) {
			for(int i=0;i<A.length;i++) {
				if(A[i]>=max) {
					max1=A[i];
				}
			}
			System.out.println("C[1]Max =" + max1);
			result[1]=max1;
		}
		
		//result[2]는 A배열중 Max 인데 result [1] 보다 작아야함 
	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
