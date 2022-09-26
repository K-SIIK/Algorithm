package prob2130;// 숫자 문자열과 영단어
//  숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임

class Prob22 {
    // 나중에 또 풀자 -----------------------------------------------------------
    public int solution(String s) {
        int answer = 0;
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < nums.length; i++) {
            s = s.replaceAll(nums[i], i + "");
        }
        return Integer.parseInt(s);
    }
}

//replaceAll 함수 - 문자열 내에 있는 모든 매개변수를 바꾸고자 하는 문자열로 치환