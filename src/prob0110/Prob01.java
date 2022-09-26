
// 2016
// 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?

package prob0110;
class Prob01 {
    public String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = b - 1 + 5;

        for (int i = 0; i < a; i++) {
            days += monthDays[i];
        }

        String answer = week[days % 7];
        return answer;
    }
}

// 날짜 세는 문제 개약함
