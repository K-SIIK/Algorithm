// 숫자의 표현
// 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수

class Prob39 {
    public int solution(int n) {
        if (n == 1) return 1;
        int answer = 1; // 자기 자신
        if (n % 2 == 1) answer++;


        return answer;
    }
}