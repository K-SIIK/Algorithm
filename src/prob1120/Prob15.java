package prob1120;// 같은 숫자는 싫어
// 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return

import java.util.*;

public class Prob15 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) result.add(arr[i - 1]);
        }
        if (arr[arr.length - 2] == arr[arr.length - 1]) result.add(arr[arr.length - 2]);
        else result.add(arr[arr.length - 1]);
        // 1122322254888
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // result에 값 넣을 때 먼저 result.add(arr[0]) 하고 for 문에서 두개 비교후 뒤에 거 넣으면 if문 안써도 됨
    public int[] solution2(int[] arr) { // 성능 훨씬 좋음
        ArrayList<Integer> result = new ArrayList<>();
        int preNum = 10;
        for (int num : arr) {
            if (num != preNum) result.add(num);
            preNum = num;
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

// ArrayList -> int[] arraylist.stream().mapToInt(Integer::intValue).toArray();