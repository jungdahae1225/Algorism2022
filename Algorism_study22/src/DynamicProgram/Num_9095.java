package DynamicProgram;
import java.util.Scanner;

/**
 * @author dahae
 * 다이나믹 프로그래밍 => 작은 문제들의 합으로 결론을 도출
 * n = 1 1   1개
 * n = 2 1+1 2개
 * n = 3 1+1+1 1+2 3개
 * n = 4 1+1+1+1 1+1+2 1+2+1 2+1+1 2+2 1+3 3+1 7개
 * n = 5 13개
 * 
 * 찾은 규칙  dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
 */
public class Num_9095 {
   
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        int[] dpArr = new int[11];
        int[] resultArr = new int[testCnt];
        
        dpArr[0] = 0;
        dpArr[1] = 1;
        dpArr[2] = 2;
        dpArr[3] = 4;
        
        for(int i = 4; i < dpArr.length; i++)
        	dpArr[i] = dpArr[i-3] + dpArr[i-2] + dpArr[i-1];
        
        for(int i = 0; i < testCnt; i++)
        	resultArr[i] = sc.nextInt();

        for(int i = 0; i < testCnt; i++)
        	System.out.println(dpArr[resultArr[i]]);

        sc.close();
    }
}
