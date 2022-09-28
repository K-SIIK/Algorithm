// [1차] 다트 게임

import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> points = new Stack<>();

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            char c1 = dartResult.charAt(i+1);
            if ('0' <= c && c <= '9') points.push(c - '0');

        }

        return answer;
    }
}
