package prob3140;
// 실패율
// 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return


import java.util.Arrays;
import java.util.Collections;

class Solution {
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
            String digit3 = String.format("%03d", N - i);
            if (totalUser == 0) failRate[i] = 0+"";
            failRate[i] = ((double) failCnt / totalUser + "") + digit3;
            totalUser -= failCnt;
        }
        Arrays.sort(failRate, Collections.reverseOrder());


        for (int j = 0; j < failRate.length; j++) {
            int beginIdx = failRate[j].length() - 3;
            int endIdx = failRate[j].length();
            answer[j] = N + 1 - Integer.parseInt(failRate[j].substring(beginIdx, endIdx));
        }
        return answer;
    }


}