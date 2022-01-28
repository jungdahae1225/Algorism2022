package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022-01-28
 * �Է¿���
 *  3
	1 8 8
	2 2 0
 * �� ���� �ذ��� ���� ����
 */
public class Num_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		Integer[] tempA = new Integer[N];
		Integer[] tempB = new Integer[N]; //B�� ��迭 �ϸ� �ȵ�
		
		/**
		 * ���� ���� ���� �۾����� ���
		 * �� ���������� ���� �� * ���� ū�� �״��� ������ * �״��� ū��
		 */
	
		for(int i = 0; i < N; i++){
			tempA[i] = sc.nextInt();
			A[i] = tempA[i];
		}
		
		for(int i = 0; i < N; i++) {
			tempB[i] = sc.nextInt();
			B[i] = tempB[i];
		}
		
		//�Է� ���� �ֵ� ����
		Arrays.sort(tempA);//A�� ��������
		Arrays.sort(tempB, Collections.reverseOrder()); //B�� ��������
	
		//���� ���� ������ ���
		
		
		
		for(int i = 0; i < B.length; i++) {
			int index = Arrays.asList(B).indexOf(tempB[i]);
			A[index] = tempA[i];
		}
		
		for(int i = 0 ; i < B.length; i++) 
			System.out.print(A[i] + " ");
		System.out.println();

		int S = 0;
		for(int i = 0; i < B.length; i++)
			S += A[i] * B[i];
		
		System.out.print(S);
		sc.close();
	}
}
