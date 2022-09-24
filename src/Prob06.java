// 자릿수 더하기
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.


public class Prob06 {
    public int solution(int n) {
//        sol 1
//        char 배열을 for문 돌려서 더하기
        int answer = 0;
        char[] tmp = (n + "").toCharArray();
        for (char i : tmp) {
            answer += (i - '0');
        }
        return answer;

//        sol 2
//        while문으로 10으로 나눈 나머지 더하기
//        int answer = 0;
//        while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//        return answer;
    }
}
