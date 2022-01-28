package Greedy;

import java.util.Scanner;

public class Num_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] coinArr = new int[N];
		
		for(int i = N-1; i >= 0; i--)
			coinArr[i] = sc.nextInt();
		
		//K���� ����µ� �ʿ��� �ּ� ���� ������ ���ϴ� ����
		//ū ������ ���� ���� �̴� ���� �߿��ϴ�.
		
		int coinCnt = 0;
		int startIndex = 0;
		
		for(int i = 0; i < coinArr.length ; i++) { //K���� ū ���� ������ ���� �ʿ� ���� ������ �ش� index�� ���ϱ�.
			if(coinArr[i] <= K) {
				startIndex = i;
				break;
			}
		}
		
		
		for(int i = startIndex ; i < coinArr.length ; i++) {
			if(K == 0)
				break;
			
			int cnt = K / coinArr[i];
			coinCnt += cnt;
			K %= coinArr[i];
		}
		
		System.out.print(coinCnt);
		sc.close();
	}

}
