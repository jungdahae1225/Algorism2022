package Greedy;
//ATM애서 모든 사람이 돈을 인출하는데 드는 시간의 최소 구하기
//행렬..?
/**
 *  3 1 4 3 2
 * [][][][][]
 *
 *
 * 앞에서부터 누적 합이 작은 순서대로
 *
 * 처음 = 배열 속에서 가장 작은 수
 * 그 다음 배열 속 가장 작은 수와
 */

import java.util.Arrays;
import java.util.Scanner;

public class Num_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //사람의 수

        int[] timeList = new int[num]; // 사람 수만큼 배열 만들기
        for(int i = 0; i < timeList.length; i++)
            timeList[i] = sc.nextInt();

        Arrays.sort(timeList);

        int[] sumArray = new int[timeList.length];

        for(int i = 0; i < timeList.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += timeList[j];
                sumArray[i] = sum;
                /**
                 *  0-0
                 *  0-0 + 0-1
                 *  0-0 + 0-1 + 0-2
                 *  0-0 + 0-1 + 0-2 + 0-3
                 *  0-0 + 0-1 + 0-2 + 0-3 + 0-4
                 *  이걸 행렬에 저장 할 것.
                 *  [0-0] [0-0 + 0-1] [0-0 + 0-1 + 0-2] [0-0 + 0-1 + 0-2] [0-0 + 0-1 + 0-2 + 0-3] [0-0 + 0-1 + 0-2 + 0-3 + 0-4]
                 */
            }
        }

        int result = 0;
        for(int i = 0; i < sumArray.length;i++)
            result += sumArray[i];

        System.out.println(result);
        
        sc.close();
        return;
    }
}
