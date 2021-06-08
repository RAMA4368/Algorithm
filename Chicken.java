package programmers;

import java.util.Scanner;

/* 1<= A,B,C <= 5000
 * 1<= X,Y <=100000
 *  양념치킨 A 원
 *  후라이드치킨 B 원
 *  반반치킨 한마리 C 원 
 *  
 *  
 *  ========구조 파악=================
 * 1)  (A+B) 가격이 2*C가격보다 크면 반반먼저 산다.
 * 2)  X>Y면  Y개까지만 산다
 * 3)  그리고  X-Y개를 더산다. 
 * 4)  A보다 2*C가 더싸면 (x-y)*2*C를 더하자
 * 5)  아니고 A가 더 싸면 (X-Y)*A로 사자
 * 6)  같으면 (X-Y)2*C로 사자 (그냥 치킨많을수록 조으니까)
 * ==============================
 * 
 * */



/**
 * 
 * @작성자: sue
 * @작성일 : 2021.06.08
 * @도와준사람 : 현딕
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
	      
	      //다섯 정수를 입력받는다.
	      //A+B값보다 2c값이 싸면
	      if((A+B) > 2*C) {
	         //c부터산다.
	         //X < Y이면
	         //X개수만큼 2C비용을 쓴다.
	         //Y-X개 만큼 B비용을 쓴다
	         if(X < Y) {
	            sum = X*2*C;
	            //만약 (Y-X)*B값보다 (Y-X)*2*C값이 더싸면
	            if(B > 2*C) {
	               sum = sum + (Y-X)*2*C;
	            }else if(B < 2*C) {
	               
	               sum = sum + (Y-X)*B;
	            }else {
	               sum = sum + (Y-X)*2*C;
	            }
	         }else if(X > Y) {
	            sum = Y*2*C;
	            //만약 (Y-X)*A값보다 (Y-X)*2*C값이 더 비싸면
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
	         //A+B값이 2c값보다 싸면
	      }else if((A+B) < 2*C) {
	         //X개수만금 A
	         //Y개수만큼 B비용을 쓴다
	         sum = X * A + Y * B;
	         //A+B값이 2c값과 같으면
	      }else {
	         //그냥 값대로 사
	         sum = X * A + Y * B;
	      }
	      System.out.println(sum);
	}
}
