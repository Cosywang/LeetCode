package WeeklyContest;

import java.util.ArrayList;
import java.util.List;

public class demo01 {

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        Solution s = new Solution();
        System.out.println(s.numOfSubarrays(nums));

    }

    static class Solution {
        public int numOfSubarrays(int[] arr) {
            int ans = 0;
            boolean isOdd;
            for(int i = 0; i < arr.length; i++){
                isOdd = false;
                if(i == arr.length-1){
                    if(arr[i] % 2 != 0) {
                        ans++;
                        break;
                    }
                }
                if(arr[i] % 2 != 0) {
                    ans++;
                    isOdd = true;
                }else{
                    isOdd = false;
                }

                for(int j = i+1; j < arr.length; j++){
                    if(!isOdd && arr[j] % 2 != 0){
                        ans++;
                        isOdd = true;
                    }else{
                        isOdd = false;
                    }
                }


            }

            return ans%(1000000007);
        }
    }
}
