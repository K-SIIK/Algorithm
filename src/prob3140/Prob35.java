package prob3140;// [1차] 비밀지도

class Prob35 { // 2점
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[][] totalMap = new char[n][n];

        for (int i = 0; i < n; i++) {
            String binary1 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            String binary2 = String.format("%0" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));
            for (int j = 0; j < n; j++) {
                boolean wall1 = (binary1.charAt(j) + "").equals("1");
                boolean wall2 = (binary2.charAt(j) + "").equals("1");
                totalMap[i][j] = (wall1 || wall2) ? '#' : ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            answer[i] = String.valueOf(totalMap[i]);
        }
        return answer;
    }
}