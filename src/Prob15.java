// 같은 숫자는 싫어
// 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr2));

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == arr[i]) temp.remove(arr2[i-1]);
        }
        if (arr[arr.length - 1] == arr[arr.length - 2]) temp.remove(arr[arr.length - 2]);
        int[] answer = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
// 122322254888
        return answer;
    }
}