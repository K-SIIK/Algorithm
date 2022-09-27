// 소수 찾기
// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환

class Prob31 { // 9점
    public int solution(int n) {
        int answer = 0;
        OUTER:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) continue OUTER;
            }
            answer++;
        }
/*
        2부터 n까지 for 문을 돌리고, 그 안에 또 for 문을 돌려서 각 수가 나누어 떨어지는 수가 있는지 확인한 후 없으면 소수
        여기서 핵심은 비교를 어디까지 해서 성능을 최대한 높이느냐이다.
        2부터 시작해서 제곱근까지 비교를 하게 되면 비교를 최소한으로 줄일 수 있다.
        2,3의 경우 for 문의 최댓값이 2보다 작기 때문에 for 문 자체를 돌릴 수가 없고 for 문을 벗어나서 answer 에 1을 더하기 때문에 상관없다.
*/
        return answer;
    }
}