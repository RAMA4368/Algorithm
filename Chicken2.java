package programmers;

import java.util.Scanner;
/*
 1<= A,B,C <= 5000
 * 1<= X,Y <=100000
 *  ���ġŲ A ��
 *  �Ķ��̵�ġŲ B ��
 *  �ݹ�ġŲ �Ѹ��� C �� 
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

public class Chicken2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ġŲ, �Ķ��̵�, �ݹ�ġŲ ���ݰ� ���ġŲ�� �Ķ��̵�ġŲ�� �ּ� ������ ������� �Է��ϼ���.");

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int sum = 0;
		int test, test1 = 0; // �ݹ� ������ �� �Ҷ�, ���Ǻ� ���� �־��� ����

		// (A+B) ������ 2*C ���ݺ��� ũ�� �ݹ� ���� ���.
		if ((A + B) > 2 * C) {
			// �ݹ� ���� ���
			if (X > Y) {
				// X>Y �̸� Y�� ���� *2 *C �� ���Ѵ�. �׸��� ���� ���ġŲ (X-Y)*A�� �����ش�
				test = (Y * 2 * C) + ((X - Y) * A);
				// X>Y ���� Y��ŭ C �� �� ���� �� �����ϴٸ� X*2*C �� ���ش�
				test1 = X * 2 * C;
				if (test < test1) {
					sum = test;
				} else {
					sum = test1;
				}
			} else if (X < Y) {
				// X<Y �̸� X�� ���� *2 *C �� ���Ѵ�.�׸��� ���� �Ķ��̵�ġŲ (X-Y)*B�� �����ش�
				test = (X * 2 * C) + ((Y - X) * B);
				// X<Y ���� Y��ŭ C �� �� ���� �� �����ϴٸ� Y*2*C �� ���ش�
				test1 = Y * 2 * C;
				if (test < test1) {
					sum = test;
				} else {
					sum = test1;
				}
			} else {
				// X=Y �̸� ���� �ƹ��ų� ���� *2 *C �� ���Ѵ�.
				sum = X * 2 * C;
			}
			// �ΰ������� ��ģ�ͺ��� �ݹ� 2�������� �� ���� ������ �ݹ��� ���ʿ� �����Ƿ�
			// ���� �Ķ��̵带 ������ ���
		} else if ((A + B) < 2 * C) {
			// ������ ���
			sum = (X * A) + (Y * B);
		}

		System.out.println("����� :" + sum);

	}
}
