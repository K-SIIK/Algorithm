class Prob03 {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) answer += "수";
            else answer += "박";
        }
        return answer;
    }
}

// 3항 연산자 왜 안씀?
// 반복문은 성능이 떨어진다나 뭐라나?