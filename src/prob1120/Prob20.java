package prob1120;// 문자열 내림차순으로 배치하기
// 자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴

import java.util.Arrays;
import java.util.Collections;

class Prob20 {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split("");
        Arrays.sort(strings, Collections.reverseOrder());
        for (String string : strings) {
            answer += string;
        }
        return answer;
    }
}