package programmers;

public class Star {

	
	/*
	������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*��
	�� �� �׷����� �׸��� ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
	 */
	

	   public static void main(String[] args) {
	      int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
	      int[] counter = new int[4];
	      for (int i = 0; i < answer.length; i++) {
	         /* (1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�. */
	         //���� answer [0] �� 1�� ��������� *�� 1�� �׸���
	    	  counter[answer[i]-1]++;
	    	  
	    	  
	    	  
	      }
	      for (int i = 0; i < counter.length; i++) {
	         /*
	          * (2) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
	          */
	         
	    	 System.out.println(counter[i]);
	    	 for(int j=0; j<counter[i]; j++) {
	    		 System.out.println("*");
	    	 }
	         System.out.println();
	      }
	   } //

	}
	/*
	  [������]
	 3***
	 2** 
	 2** 
	 4****
	 */

