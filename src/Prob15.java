// 같은 숫자는 싫어
// 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] != arr[i]) temp.add(arr[i-1]);

        }
// 122322254888
        return answer;
    }
}