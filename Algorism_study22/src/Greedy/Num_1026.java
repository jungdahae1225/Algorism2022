package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/***
 * 
 * @author dahae
 * 2022-01-28
 * 입력예시
 *  3
	1 8 8
	2 2 0
 * 에 대한 해결을 하지 못함
 */
public class Num_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		Integer[] tempA = new Integer[N];
		Integer[] tempB = new Integer[N]; //B는 재배열 하면 안됨
		
		/**
		 * 곱의 합이 제일 작아지는 방법
		 * 양 끝에서부터 작은 수 * 제일 큰수 그다음 작은수 * 그다음 큰수
		 */
	
		for(int i = 0; i < N; i++){
			tempA[i] = sc.nextInt();
			A[i] = tempA[i];
		}
		
		for(int i = 0; i < N; i++) {
			tempB[i] = sc.nextInt();
			B[i] = tempB[i];
		}
		
		//입력 받은 애들 정렬
		Arrays.sort(tempA);//A는 오름차순
		Arrays.sort(tempB, Collections.reverseOrder()); //B는 내림차순
	
		//같은 수가 들어오는 경우
		
		
		
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
