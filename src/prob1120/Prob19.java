package prob1120;// 문자열 내 마음대로 정렬하기
//  문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬

import java.util.Arrays;
class Solution {
    // ============================================== 못 품 =============================================
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String strI = strings[i].substring(n);
                String strJ = strings[j].substring(n);
                if (strJ.compareTo(strI) < 0) {
                    String tmp = strings[j];
                    strings[j] = strings[i];
                    strings[i] = tmp;
                }
            }
        }
        return strings;
    }


    public String[] solution2(String[] strings, int n) {
        // n번째 idx 를 맨 앞에 붙인 후 정렬 후 뗀다음 배열에 넣기
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];
        int i = 0;
        for (String string : strings) {
            temp[i++] = string.charAt(n) + string;
        }
        Arrays.sort(temp);
        i = 0;
        for (String string : temp) {
            answer[i++] = string.substring(1);
        }
        return answer;
    }
}