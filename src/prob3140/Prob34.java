package prob3140;// 폰켓몬
// 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리

import java.util.Arrays;
import java.util.HashSet;

class Prob34 { // 1점
    public int solution(int[] nums) {
        int num = nums.length;
        Integer[] tmp = new Integer[num];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = nums[i];
        }
        HashSet<Integer> dupDel = new HashSet<>(Arrays.asList(tmp));
        if (num / 2 >= dupDel.size()) return dupDel.size();
        else return num / 2;
    }


}