package prob2130;// K번째수
// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

import java.util.ArrayList;
import java.util.Collections;

class Prob29 { // 3점
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int begin = commands[i][0] - 1, end = commands[i][1] - 1, idx = commands[i][2] - 1;
            ArrayList<Integer> extractArr = new ArrayList<>();
            for (int j = begin; j <= end; j++) {
                extractArr.add(array[j]);
            }
            Collections.sort(extractArr);
            answer[i] = extractArr.get(idx);
        }
        return answer;
    }
}
// Arrays.copyOfRange(arr, begin, end) 함수 -> 배열의 일부를 복사하는 함수
//ArrayList 오름차순 -> Collections.sort(arraylist)