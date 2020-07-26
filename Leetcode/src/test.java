import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int t = 0;
        Solution s = new Solution();
        List<List<Integer>> li = s.fourSum(nums, t);
        for(List<Integer> l: li){
            for (Integer integer : l) {
                System.out.print(integer + ",");
            }
            System.out.println();
        }
    }

    public static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            int n = nums.length;
            if(n<4) return ans;


            for(int i=0;i<n-3;i++){
                for(int j=i+1;j<n-2;j++){
                    for(int k=j+1;k<n-1;k++){
                        for(int l=k+1;l<n;l++){
                            if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                                List<Integer> tmp = new ArrayList<>();
                                tmp.add(nums[i]);
                                tmp.add(nums[j]);
                                tmp.add(nums[k]);
                                tmp.add(nums[l]);
                                ans.add(tmp);
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }
}
