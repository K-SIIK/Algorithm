// [1차] 비밀지도

import java.util.Arrays;

class Prob35 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] totalMap = new char[n][n];

        for (int i = 0; i < n; i++) {
            String binary1 = String.format("%0" + n + "s", Integer.toBinaryString(arr1[i]));
            String binary2 = String.format("%0" + n + "s", Integer.toBinaryString(arr2[i]));
            System.out.println(binary1);
            for (int j = 0; j < n; j++) {
                boolean wall1 = (binary1.charAt(j) + "").equals("1");
                boolean wall2 = (binary2.charAt(j) + "").equals("1");
                totalMap[i][j] = (wall1 || wall2)? '#' : ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = Arrays.toString(totalMap[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Prob35 p = new Prob35();
        int n = 5;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        p.solution(n,arr1,arr2);
    }
}