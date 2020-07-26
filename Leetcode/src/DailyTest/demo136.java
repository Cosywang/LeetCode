package DailyTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo136 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,1,5};
        System.out.println(s.maxCoins(nums));
    }


    static class Solution {
        private int ans;

        public int maxCoins(int[] nums) {
            int coins = 0;
            List<Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toList());
            helper(num, coins);
            return ans;
        }
        public void helper(List<Integer> nums, int coins){
            // boundary
            if(nums.size() == 0){
                ans = Math.max(ans, coins);
                return;
            }
            // search
            for(int i = 0; i < nums.size(); i++){
                int delta = nums.get(i) * (i == 0? 1: nums.get(i-1)) * (i == nums.size()-1? 1: nums.get(i+1));
                int tmp = nums.get(i);
                nums.remove(i);
                helper(nums, coins + delta);
                nums.add(i, tmp);
            }
        }
    }
}
