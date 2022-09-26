package prob1120;// 모의고사
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
// 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return

import java.util.ArrayList;
class Prob18 {
    public int[] solution(int[] answers) {
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo1[i % supo1.length]) cnt[0]++;
            if (answers[i] == supo2[i % supo2.length]) cnt[1]++;
            if (answers[i] == supo3[i % supo3.length]) cnt[2]++;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        for (int i=0; i<cnt.length; i++) {
            if (max == cnt[i]) {
                result.add(i+1);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

// ArrayList -> int[] -- sol 1) for문 노가다
// ArrayList -> int[] -- sol 2) int[] intArr = arraylist.stream().mapToInt(Integer::intValue).toArray();