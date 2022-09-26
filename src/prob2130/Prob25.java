package prob2130;// 약수의 개수와 덧셈
// left 부터 right 까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return

class Prob25 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            // 제곱수만 약수가 홀수개
            if (Math.pow((int) Math.sqrt(i), 2) == i) answer -= i;
            else answer += i;
        }
        return answer;
    }
}