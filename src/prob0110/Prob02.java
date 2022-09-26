package prob0110;// 나누어 떨어지는 숫자 배열
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수

import java.util.ArrayList;
import java.util.Collections;

class Prob02 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                temp.add(num);
            }
        }
        if (temp.size() == 0) temp.add(-1);
        int[] answer = new int[temp.size()];
        Collections.sort(temp);

        for (int i=0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
            return answer;


    }
}

// ArrayList -> String[] 방법도 까먹음..