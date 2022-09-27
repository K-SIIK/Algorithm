package prob3140;
// 최댓값과 최솟값
// s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

class Prob38 { // 2점
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = -111111111, min = 100000000 ;
        for (String str : arr) {
            max = Math.max(max, Integer.parseInt(str));
            min = Math.min(min, Integer.parseInt(str));
        }
        answer = min + " " + max;
        return answer;
    }
}
// Arrays.sort() 함수로 오름차순 정렬해서 푸는 방법도 있음