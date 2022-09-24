// 이상한 문자 만들기
// "try hello world"  ->  "TrY HeLlO WoRlD"

class Prob05 {
    public String solution(String s) {
//        sol 1

        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            idx = (s.charAt(i) == ' ') ? 0 : idx + 1;
            answer += (idx % 2 == 0) ? (s.charAt(i) + "").toLowerCase() : (s.charAt(i) + "").toUpperCase();
        }
        return answer;

//        sol 2
//        String answer = "";
//        String[] array = s.split("");
//        int cnt = 0;
//        for (String str : array) {
//            cnt = (str.equals(" ")) ? 0 : cnt + 1;
//            answer += (cnt % 2 == 0) ? str.toLowerCase() : str.toUpperCase();
//        }
//        return answer;

//        sol 3
//        String answer = "";
//        char[] temp = s.toCharArray();
//        int idx = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i] == ' ') {
//                idx = 0;
//            } else {
//            }
//            temp[i] = (idx++ % 2 == 0) ? Character.toUpperCase(temp[i]) : Character.toLowerCase(temp[i]);
//        }
//
//        return String.valueOf(temp);
    }
}

// String char[]로 변환할 때 .toCharArray()
// char 대소문자 변환할 때 Character.toUpperCase()
// char[] -> String 변환 할 때 String.valueOf
