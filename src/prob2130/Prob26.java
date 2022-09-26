package prob2130;// 약수의 합
// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

class Prob26 {
    public int solution(int n) {
        if (n == 0 || n == 1) return n;
        int answer = 1; // 모든 수의 약수
        for (int i = 2; i <= n / 2; i++) {
            // 성능을 좋게 하기 위해 자기 자신을 제외한 가장 큰 약수인 n/2까지만  for 문 돌린 후 자기 자신 나중에 더하기
            if (n % i == 0) answer += i;
        }
        return answer + n;
    }
}

// 잔머리굴려서 1이라도 for 문 안돌리려고 answer 에 1더해 놨다가 if 문 작성하게 됐음