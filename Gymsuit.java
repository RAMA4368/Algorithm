package programmers;

import java.util.ArrayList;

/* 전체 학생 수 : b (2명 이상 30명 이하)
	체육복 도난당한 학생들 번호가 담긴 배열 : lost[]
	여벌 체육복을 가져온 학생들의 번호가 담긴 배열 : reserve[]
	체육수업 들을 수 있는 학생의 최댓값 return 하도록 solution
*/

/*================
 * 				생각 정리
 * ================
 * 1) 만약, 도난당한 학생과 여벌 체육복 소유자가 겹치면 번호 빌려줄수 없는 상태로 전환 : -1  
 * 2) 도난 당한 학생의 앞, 뒤 번호 학생이 여벌 옷을 가지고 있으면 학생에게 옷 빌려주고 여벌 옷 가진 학생은 -1
 * */


public class Gymsuit {
	

	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;
		
		//여벌 옷을 가지고 있는 학생이 도난 당하면 빌려줄 수 없도록
		for(int i=1; i< lost.length;i++ ) {
			for(int j=1; j<reserve.length;j++) {
				 if(lost[i]==reserve[j]) {
					 System.out.println(lost[i]+"번 학생은 옷을 빌려줄 수 없어요");
					 lost[i] = -1;
					 reserve[j] = -1;
					 lost1++;
					 break;
				 }
			}
		}
		// lost[1][2][3] reserve [1] [2]   
		//        1  3   5  				2 	  4
		
		//도난 당한 학생 앞, 뒤 번호 학생 여벌 옷 있으면 옷 빌려주고 가진 학생 -1
		for(int i=1;i<lost.length;i++) { //3
			for(int j=1;j<reserve.length;j++) { //2
				if(lost[i]==reserve[j]+1||lost[i]==reserve[j]-1) {
					count++;//앞뒤로 있는 애들한테 빌려줬으니까 카운트 하고 , 빌려줬으니 더 이상 빌려주지 못하게 -1 로 만들어준다 
					reserve[j] = -1;
					break;
				}
				
			}
		}
		
		answer= n - lost.length + lost1 + count;
		
		return answer;
	}
	
	
	
	
public static void main(String[] args) {
	
	System.out.println("체육복 도난은"+1+"명이 당했어요 ㅠㅠ ");
	int x = solution(5, new int[4] , new int[3]);
	System.out.println("정답은 : "+x);
	Gymsuit g = new Gymsuit();
	
	
	}
}
