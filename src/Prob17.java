// 로또의 최고 순위와 최저 순위
// 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return

class Prob17 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cntO = 0;
        int hit = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) cntO++;
            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    hit++;
                    break;
                }
            }
        }
        answer[0] = 7 - (cntO + hit);
        answer[1] = 7 - hit;
        if (answer[0] == 7) answer[0] = 6;
        if (answer[1] == 7) answer[1] = 6;


        return answer;
    }
}