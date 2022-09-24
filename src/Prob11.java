// 콜라츠 추측
// 1-1. 입력된 수가 짝수라면 2로 나눕니다.
// 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
// 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

class Prob11 {
    public int solution(int num) {
//        sol 1
        int answer = 0;
        long temp = num;
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
                answer++;
            } else {
                temp = 3 * temp + 1;
                answer++;
            }
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;

//        sol 2
//        long n = num;
//        for (int i = 0; i < 500; i++) {
//            if (n == 1) return i;
//            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
//        }
//        return -1;
    }
}