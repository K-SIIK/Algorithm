package prob2130;
// 신규 아이디 추천
// 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발

class Solution {
    public String solution(String new_id) {
        String answer = "";
        // step 1
        new_id = new_id.toLowerCase();
        // step 2
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            boolean alpha = 'a' < c && c < 'z';
            boolean sign = c == '-' || c == '_' || c == '.';
            if (!(alpha || sign)) new_id = new_id.replace(c + "", "");
        }

        // step 3
        while (true) {
            if (new_id.contains("..")) {
                new_id = new_id.replace("..", "");
            } else break;
        }

        // step 4
        if (new_id.charAt(0) == '.') new_id = new_id.substring(1);
        if (new_id.charAt(new_id.length() - 1) == '.')
            new_id = new_id.substring(0, new_id.length() - 1);

        // step 5
        if (new_id.length() == 0) new_id = "a";

        // step 6
        if (new_id.length() >= 16) new_id = new_id.substring(0, 16);

        // step 7
        if (new_id.length() == 1) new_id += new_id.charAt(0) + new_id.charAt(0);
        if (new_id.length() == 2) new_id += new_id.charAt(1);

        return new_id;
    }
}

/*
 정규표현식 벨로그에 정리해놓음
 */