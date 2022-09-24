//제일 작은 수 제거하기
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
//        sol 1
//        if (arr.length == 1) return new int[]{-1};
//        int min = arr[0];
//        for (int i : arr) {
//            if (i < min) min = i;
//        }
//
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i: arr) {
//            if (i == min) continue;
//            temp.add(i);
//        }
//
//        return temp.stream().mapToInt(i -> i).toArray();

//        sol 2
        if (arr.length == 1) return new int[]{-1};

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i : arr) {
            arrayList.add(i);
        }

        Integer min = Collections.min(arrayList);
        arrayList.remove(min);

        int[] answer = new int[arr.length - 1];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;

    }
}

// ArrayList 내의 최솟값 찾는 함수 Collections.min()
// ArrayList 내의 인덱스가 아닌 요소를 지워려면 remove()함수 안에 int 타입의 변수가 아닌 Integer 타입의 변수 넣기