package programmers;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

/* 
 * 1) a�� �迭�� ����
 	2) b�� �迭�� ���� 
 	2-1) c�� ù°�ڸ����� a�� �迭�� ���� ũ�鼭 b�� ù°�ڸ� ������ �۾ƾ��Ѵ�.
 	3) ù°�ڸ����� b�� [0]��° �ִ� ģ���� ���ų� �۾ƾ� �Ѵ�.
 	4) ��°�ڸ����� ���࿡ b�� [0]��° �ִ� ģ������ �۾Ҵٸ� �ƹ����� �������
 	5) ��°�ڸ����� ���� b�� [0]��° �ִ� ģ���� ���Ҵٸ� [1]��° �ִ� ���� ���ų� �۾ƾ� �Ѵ�
 	6) ��°�ڸ����� ���� b�� [0]��° �ִ� ģ����
 	7) a�� �迭�� b�� �迭�� ����ִ� ���ڿ� ������ �� [0] �� ����ִ� ������ �۰ų� �������� ���ٸ� -1 �� ����Ѵ�.   
*/



public class ReArray {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("a�� �Է��ϼ���");
		String a =sc.next();  
		System.out.println("b�� �Է��ϼ���");
		String b=sc.next();
		System.out.println("a.length::" + a.length());
		int [] A = new int[a.length()];
		int [] B = new int[b.length()];
		int [] C =new int[a.length()];
		int [] result= new int[a.length()];//C�� �����
		int max = C[0];
		int max1 = A[0];
		int max2 = A[0];
		int max3 = A[0];
		for(int i=0;i<a.length();i++) {
			A[i] = a.charAt(i) - '0'; //�ƽ�Ű�ڵ�� 0�� 48�̴�. 
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
		
		//A[]�� B[]�� ���ؾ��Ѵ�. ���ؼ� B[] ���� ������ A[]�� ���� �۾ƾ��Ѵ�.  
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<1;j++) {
				if(A[i]<=B[j]) {
					System.out.println("C�� ù��° �ڸ� ���� :: " + A[i] +"����ص��ǿ�");
					C[i]=A[i];
					
				}
			}
		}
		for(int k=0;k<C.length;k++) {
			System.out.println("C["+k+"]=" + C[k]);
			if(C[k]>=max) {//C[k]�� ���� ������ ������ �����ϴ� �� �� ���� ū ���� ù°�ڸ��� �ִ´�. 
				max = C[k];
			}
		}
		System.out.println("Max = " + max);
		result[0] = max;
		
		
		//result[0] �� B[0]���� �۰ų� ������ result[1]��° ģ����  A�迭�� ���� ū��   
		if(result[0]<=B[0]) {
			for(int i=0;i<A.length;i++) {
				if(A[i]>=max) {
					max1=A[i];
				}
			}
			System.out.println("C[1]Max =" + max1);
			result[1]=max1;
		}
		
		//result[2]�� A�迭�� Max �ε� result [1] ���� �۾ƾ��� 
	
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
