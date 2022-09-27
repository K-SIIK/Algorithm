public class Main {
    // 문제 1
    public String solution(int num) {
        StringBuilder answer = new StringBuilder();
        char[] strNum = (num + "").toCharArray();
        int sum = strNum[strNum.length - 1] - '0';
        answer.append(strNum[strNum.length - 1] - '0');
        for (int i = strNum.length - 2; i >= 0; i--) {
            answer.append(" + ").append(strNum[i] - '0');
            sum += strNum[i] - '0';
        }
        answer.append(" = ").append(sum);
        return answer.toString();
    }

    // 문제 2
//    public int solution(int[] arr1, int[] arr2) {
//        int sum = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] >= 29) arr2[i] = 21;
//            sum += arr2[i] - arr1[i];
//        }
//        return sum;
//    }

    // 문제 3
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int primeMax = 0, notPrimeMin = 100;

        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (isPrime(n)) primeMax = Math.max(primeMax, n);
            else notPrimeMin = Math.min(notPrimeMin, n);
        }
        answer = notPrimeMin + " " + primeMax;
        return answer;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        Main method = new Main();
        String s ="97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }
}
