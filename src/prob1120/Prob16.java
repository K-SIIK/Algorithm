package prob1120;//  두 개 뽑아서 더하기
// numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return

import java.util.Arrays;
import java.util.HashSet;

class Prob16 {
    public Integer[] solution(int[] numbers) {
//        Integer[] numbers2 = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        HashSet<Integer> dupDel = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                dupDel.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] answer = dupDel.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}

// TreeSet은 알아서 정렬된다.
// Set -> 배열  - Integer[] 타입으로 바꿔야 hashset.toArray(new Integer[0])함수 사용가능
// 배열 -> set  - Integer[] 타입으로 바꿔야 함 Integer[] integerArr = Arrays.stream(intArr).boxed().toArray(Integer::new)