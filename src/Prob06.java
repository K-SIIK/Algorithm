// 자릿수 더하기
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.


public class Prob06 {
    public int solution(int n) {
//        sol 1

        int answer = 0;
        char[] tmp = (n + "").toCharArray();
        for (char i : tmp) {
            answer += (i - '0');
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;

//        sol 2
//        int answer = 0;
//        while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }
//        return answer;
    }
}
