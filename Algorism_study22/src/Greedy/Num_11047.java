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
		
		//K원을 만드는데 필요한 최소 동전 개수를 구하는 문제
		//큰 동전을 가장 많이 뽑는 것이 중요하다.
		
		int coinCnt = 0;
		int startIndex = 0;
		
		for(int i = 0; i < coinArr.length ; i++) { //K보다 큰 동전 단위는 셈에 필요 없기 때문에 해당 index를 구하기.
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
