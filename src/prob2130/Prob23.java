package prob2130;// 시저 암호
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수

class Prob23 {
    public String solution(String s, int n) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetC = alphabet.toUpperCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
                continue;
            }
            if (alphabetC.contains(c+"")) {
                int idx = (alphabetC.indexOf(c) + n) % alphabetC.length();
                sb.append(alphabetC.charAt(idx));
            }
            if (alphabet.contains(c+"")) {
                int idx = (alphabet.indexOf(c) + n) % alphabet.length();
                sb.append(alphabet.charAt(idx));
            }
        }
        return sb.toString();
    }
}