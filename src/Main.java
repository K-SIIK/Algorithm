import java.util.Arrays;
import java.util.Stack;

public class Main {
    public int solution(int[] arr1) { // 없는 정수 사이의 합
        int idx = 0;
        String s = "0123456789";
        for (int i : arr1) {
            if (s.contains(i + "")) {
                s = s.replace(i + "", "");
            }
        }
        String[] num = s.split("");
        int max = Math.max(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
        int min = (max == Integer.parseInt(num[0])) ? Integer.parseInt(num[1]) : Integer.parseInt(num[0]);
        return max * (max + 1) / 2 - min * (min - 1) / 2;
    }

    public String solution2(String s) { // 이상한 문자 만들기
        StringBuilder answer = new StringBuilder();
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                ++idx;
                if (idx % 2 == 0) answer.append((c + "").toUpperCase());
                else answer.append(c);
            } else answer.append(c);
        }
        return answer.toString();
    }

    public String[] solution3(String[] arr, int n) { // 같은 단어는 싫어
        Stack<String> dupDel = new Stack<>();
        Arrays.sort(arr);
        String tmp = "";
        for (String s : arr) {
            if (dupDel.isEmpty()) dupDel.push(s);
            else {
                if (dupDel.peek().equals(s)) {
                    tmp = dupDel.peek();
                    dupDel.pop();
                } else {
                    if (!tmp.equals(s)) dupDel.push(s);
                }
            }
        }
        String[] sort = new String[dupDel.size()];
        for (int i = 0; i < sort.length; i++) {
            sort[i] = dupDel.peek().charAt(n) + dupDel.peek();
            dupDel.pop();
        }
        Arrays.sort(sort);
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sort[i].substring(1);
        }


        return sort;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] arr1 = {1, 3, 5, 9, 2, 4, 8, 0};
        System.out.println(m.solution(arr1));

        String s = "hang hae ninety nine";
        System.out.println(m.solution2(s));

        String[] arr = {"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"};
        String[] arr2 = {"banana", "cat", "car", "apple", "banana", "banana"};
        String[] arr3 = {"brush", "sun", "brush", "bed", "car"};
        int n = 2;
        System.out.println(Arrays.toString(m.solution3(arr, n)));

    }
}

