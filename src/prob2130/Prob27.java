package prob2130;
// 예산
// 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget 이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return

import java.util.Arrays;

class Prob27 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Integer[] ascendingOrder = new Integer[d.length];
        for (int i = 0; i < d.length; i++) {
            ascendingOrder[i] = d[i];
        }
        Arrays.sort(ascendingOrder);


        for (Integer i : ascendingOrder) {
            budget -= i;
            if (budget < 0) break;
            answer++;
        }
        return answer;
    }
}

// Arrays.sort()로 오름차순은 int[] 배열도 가능하지만, 내림차순은 그 안에 Collections.reverseOrder 함수도 써야해서 Wapper클래스로 변환해야함