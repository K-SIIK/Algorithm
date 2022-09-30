package prob3140;// 숫자의 표현
// 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수

class Solution { // 9점
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while (num <= (double) (n / 2)) {
            int sum = 0;
            for (int i = num; i <= n / 2 + 1; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
            num++;
        }
        return answer;
    }
}