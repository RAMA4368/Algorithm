package programmers;

public class Jvm {

	
	static int a = 0; //�������� (����) == method ���� 
	int b = 0; //�������� (����) ==method ����
	
	
	
	//�Լ� 
	public int test(int c, int d) {//c�� d�� �Ű������ϱ� stack ���� 
		
		int result = 0;// ���������ϱ� stack ����  
		result = c+d;
	
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		 Jvm jvm = new Jvm();//jvm�� Ŭ���� �����ϱ� Method , new �� ��ü ��ü�� heap ������ ��! 
		 a = jvm.test(1, 2); // �Լ�ȣ�� 
		 System.out.println(a);
		 
	}
}
