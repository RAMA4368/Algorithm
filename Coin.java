package programmers;

public class Coin {

	
	/*
	 ������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. ��
	�� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� �����
	��. ��, ������ �� ���� ���� �������� �Ž��� �־���Ѵ�. (1)�� �˸��� �ڵ带 �־
	���α׷��� �ϼ��Ͻÿ�.
	 */

	   public static void main(String args[]) {
	      // ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
	      int[] coinUnit = { 500, 100, 50, 10 };
	      int money = 2680;
	      int money1 = 2680;
	      int count = 0;
	      System.out.println("�ʱ�money=" + money);
	      for (int i = 0; i < coinUnit.length; i++) {
	      
	    		  while(money>=coinUnit[i]) {
	    				  money = money-coinUnit[i];
	    				  count++;
	    		  }
	    		  
	    		  System.out.println(coinUnit[i]+"�� =" + count +"��");
	    		  count=0;//count �ʱ�ȭ
	    		  System.out.println("====================");
	      }
	   } // main

	
}
