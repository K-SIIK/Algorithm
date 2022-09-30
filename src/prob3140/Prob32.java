package prob3140;
// 실패율
// 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return

import java.util.Arrays;
import java.util.Collections;

class Prob32 { // 9점
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        String[] failRate = new String[N];
        int totalUser = stages.length;
        for (int i = 0; i < N; i++) {
            int failCnt = 0;
            for (int stage : stages) {
                if (stage == (i + 1)) {
                    failCnt++;
                }
            }
            String rate, rank;
            if (totalUser == 0) rate = String.format("%.10f", (double) 0);
            else rate = String.format("%.10f", (double) failCnt / totalUser);
            rank = String.format("%03d", N - i);
            failRate[i] = rate + rank;
            totalUser -= failCnt;
        }
        Arrays.sort(failRate, Collections.reverseOrder());


        for (int i = 0; i < failRate.length; i++) {
            int beginIdx = failRate[i].length() - 3;
            int endIdx = failRate[i].length();
            answer[i] = N + 1 - Integer.parseInt(failRate[i].substring(beginIdx, endIdx));
        }
        return answer;
    }
}