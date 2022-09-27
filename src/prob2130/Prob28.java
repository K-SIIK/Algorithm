package prob2130;// 최대공약수와 최소공배수
// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수

class Solution { // 4점
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0, lcm = 200000000;
        int biggerNum = Math.max(n, m);
        for (int i = 1; i <= m * n; i++) {
            // 범위는 m*n까지 -> 소수끼리의 최소공배수가 m*n
            if (m % i == 0 && n % i == 0) gcd = Math.max(gcd, i);
            if (i % m == 0 && i % n == 0) lcm = Math.min(lcm, i);
        }
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }
}