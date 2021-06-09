package programmers;

public class Star {

	
	/*
	다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
	을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
	 */
	

	   public static void main(String[] args) {
	      int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
	      int[] counter = new int[4];
	      for (int i = 0; i < answer.length; i++) {
	         /* (1) 알맞은 코드를 넣어 완성하시오. */
	         //만약 answer [0] 에 1이 들어있으면 *을 1개 그린다
	    	  counter[answer[i]-1]++;
	    	  
	    	  
	    	  
	      }
	      for (int i = 0; i < counter.length; i++) {
	         /*
	          * (2) 알맞은 코드를 넣어 완성하시오.
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
	  [실행결과]
	 3***
	 2** 
	 2** 
	 4****
	 */

