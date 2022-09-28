package prob3140;
// 크레인 인형뽑기 게임

import java.util.Stack;

class Prob40 { // 7점
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for (int column : moves) {
            int idx = column - 1;
            for (int[] row : board) {
                if (row[idx] != 0) {
                    if (basket.isEmpty()) {
                        basket.push(row[idx]);
                    }
                     else {
                        if (basket.peek() == row[idx]) {
                            answer += 2;
                            basket.pop();
                        } else {
                            basket.push(row[idx]);
                        }
                    }
                    row[idx] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}