package programmers;

import java.util.ArrayList;

/* ��ü �л� �� : b (2�� �̻� 30�� ����)
	ü���� �������� �л��� ��ȣ�� ��� �迭 : lost[]
	���� ü������ ������ �л����� ��ȣ�� ��� �迭 : reserve[]
	ü������ ���� �� �ִ� �л��� �ִ� return �ϵ��� solution
*/

/*================
 * 				���� ����
 * ================
 * 1) ����, �������� �л��� ���� ü���� �����ڰ� ��ġ�� ��ȣ �����ټ� ���� ���·� ��ȯ : -1  
 * 2) ���� ���� �л��� ��, �� ��ȣ �л��� ���� ���� ������ ������ �л����� �� �����ְ� ���� �� ���� �л��� -1
 * */


public class Gymsuit {
	

	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;
		
		//���� ���� ������ �ִ� �л��� ���� ���ϸ� ������ �� ������
		for(int i=1; i< lost.length;i++ ) {
			for(int j=1; j<reserve.length;j++) {
				 if(lost[i]==reserve[j]) {
					 System.out.println(lost[i]+"�� �л��� ���� ������ �� �����");
					 lost[i] = -1;
					 reserve[j] = -1;
					 lost1++;
					 break;
				 }
			}
		}
		// lost[1][2][3] reserve [1] [2]   
		//        1  3   5  				2 	  4
		
		//���� ���� �л� ��, �� ��ȣ �л� ���� �� ������ �� �����ְ� ���� �л� -1
		for(int i=1;i<lost.length;i++) { //3
			for(int j=1;j<reserve.length;j++) { //2
				if(lost[i]==reserve[j]+1||lost[i]==reserve[j]-1) {
					count++;//�յڷ� �ִ� �ֵ����� ���������ϱ� ī��Ʈ �ϰ� , ���������� �� �̻� �������� ���ϰ� -1 �� ������ش� 
					reserve[j] = -1;
					break;
				}
				
			}
		}
		
		answer= n - lost.length + lost1 + count;
		
		return answer;
	}
	
	
	
	
public static void main(String[] args) {
	
	System.out.println("ü���� ������"+1+"���� ���߾�� �Ф� ");
	int x = solution(5, new int[4] , new int[3]);
	System.out.println("������ : "+x);
	Gymsuit g = new Gymsuit();
	
	
	}
}
