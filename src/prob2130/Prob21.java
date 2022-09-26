package prob2130;// 소수 만들기
// nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return

class Prob21 {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

// 조합 공부하자