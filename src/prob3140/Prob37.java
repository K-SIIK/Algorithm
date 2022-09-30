package prob3140;// [1차] 다트 게임

class Prob37 { // 3점
    public int solution(String dartResult) {
        int answer = 0;
        int[] points = new int[3];
        int idx = -1;
        if (dartResult.contains("10")) dartResult = dartResult.replace("10", " ");
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c == ' ') {
                points[++idx] = 10;
            } else if ('0' <= c && c <= '9') {
                points[++idx] = c - '0';
            }
            if (c == 'D') points[idx] *= points[idx];
            if (c == 'T') points[idx] *= points[idx] * points[idx];
            if (c == '*') {
                switch (idx) {
                    case 0:
                        points[0] *= 2;
                        break;
                    case 1:
                        points[0] *= 2;
                        points[1] *= 2;
                        break;
                    case 2:
                        points[1] *= 2;
                        points[2] *= 2;
                        break;
                }
            }
            if (c == '#') points[idx] *= -1;
        }

        for (int point : points) {
            answer += point;
        }

        return answer;
    }
}
