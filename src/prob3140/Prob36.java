package prob3140;
// [카카오 인턴] 키패드 누르기

class Prob36 { // 5점
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        boolean right = hand.equals("right");
        String l = "30", r = "32";
        for (int number : numbers) {
            if (number == 0) number = 11;
            switch (number) {
                case 1: case 4: case 7:
                    l = ((number - 1) / 3) + "0";
                    answer.append("L");
                    break;
                case 3: case 6: case 9:
                    r = ((number / 3) - 1) + "2";
                    answer.append("R");
                    break;
                case 2: case 5: case 8: case 11:
                    String location = ((number - 2) / 3) + "1";
                    int distanceL = Math.abs(l.charAt(0) - location.charAt(0)) + Math.abs(l.charAt(1) - location.charAt(1));
                    int distanceR = Math.abs(r.charAt(0) - location.charAt(0)) + Math.abs(r.charAt(1) - location.charAt(1));
                    if (distanceR < distanceL) {
                        r = location;
                        answer.append("R");
                    } else if (distanceR > distanceL) {
                        l = location;
                        answer.append("L");
                    } else {
                        if (right) {
                            r = location;
                            answer.append("R");
                        } else {
                            l = location;
                            answer.append("L");
                        }
                    }
                    break;
            }
        }
        return answer.toString();
    }
}