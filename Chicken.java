package programmers;

import java.util.Scanner;

/* 1<= A,B,C <= 5000
 * 1<= X,Y <=100000
 *  ���ġŲ A ��
 *  �Ķ��̵�ġŲ B ��
 *  �ݹ�ġŲ �Ѹ��� C �� 
 *  
 *  
 *  ========���� �ľ�=================
 * 1)  (A+B) ������ 2*C���ݺ��� ũ�� �ݹݸ��� ���.
 * 2)  X>Y��  Y�������� ���
 * 3)  �׸���  X-Y���� �����. 
 * 4)  A���� 2*C�� ���θ� (x-y)*2*C�� ������
 * 5)  �ƴϰ� A�� �� �θ� (X-Y)*A�� ����
 * 6)  ������ (X-Y)2*C�� ���� (�׳� ġŲ�������� �����ϱ�)
 * ==============================
 * 
 * */



/**
 * 
 * @�ۼ���: sue
 * @�ۼ��� : 2021.06.08
 * @�����ػ�� : ����
 * 
 */

public class Chicken {
	
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	      
	      int A = sc.nextInt();
	      int B = sc.nextInt();
	      int C = sc.nextInt();
	      int X = sc.nextInt();
	      int Y = sc.nextInt();
	      int sum = 0;
	      
	      //�ټ� ������ �Է¹޴´�.
	      //A+B������ 2c���� �θ�
	      if((A+B) > 2*C) {
	         //c���ͻ��.
	         //X < Y�̸�
	         //X������ŭ 2C����� ����.
	         //Y-X�� ��ŭ B����� ����
	         if(X < Y) {
	            sum = X*2*C;
	            //���� (Y-X)*B������ (Y-X)*2*C���� ���θ�
	            if(B > 2*C) {
	               sum = sum + (Y-X)*2*C;
	            }else if(B < 2*C) {
	               
	               sum = sum + (Y-X)*B;
	            }else {
	               sum = sum + (Y-X)*2*C;
	            }
	         }else if(X > Y) {
	            sum = Y*2*C;
	            //���� (Y-X)*A������ (Y-X)*2*C���� �� ��θ�
	            if(A > 2*C) {
	               sum = sum + (X-Y)*2*C;
	            }else if(A < 2*C) {
	               
	               sum = sum + (X-Y)*A;
	            }else {
	               sum = sum + (X-Y)*2*C;
	            }
	         }else {
	            sum = X*2*C;
	         }
	         //A+B���� 2c������ �θ�
	      }else if((A+B) < 2*C) {
	         //X�������� A
	         //Y������ŭ B����� ����
	         sum = X * A + Y * B;
	         //A+B���� 2c���� ������
	      }else {
	         //�׳� ����� ��
	         sum = X * A + Y * B;
	      }
	      System.out.println(sum);
	}
}
