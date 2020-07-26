package WeeklyContest;

import java.util.ArrayList;

public class demo02 {
    public static void main(String[] args) {
        String str = "aacaba";
        Solution s = new Solution();
        System.out.println(s.numSplits(str));
    }

    static class Solution {
        public int numSplits(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;
            if(n == 1) return 0;
            int ans=0;
            int s1,e1,s2,e2;
            int count1 = 0;
            int count2 = 0;
            for(int i = 0; i < n; i++){
                s1 = 0;
                e1 = i;
                s2 = i+1;
                e2 = n-1;
                ArrayList<Character> li = new ArrayList<Character>();
                while(s1<=e1){
                    if(!li.contains(chars[s1])) {
                        li.add(chars[s1]);
                        count1++;
                    }
                    if(!li.contains(chars[e1])) {
                        li.add(chars[e1]);
                        count1++;
                    }
                    s1++;
                    e1--;
                }
                li.clear();
                while(s2<=e2){
                    if(!li.contains(chars[s2])) {
                        li.add(chars[s2]);
                        count2++;
                    }
                    if(!li.contains(chars[e2])) {
                        li.add(chars[e2]);
                        count2++;
                    }
                    s2++;
                    e2--;
                }
                if(count1 == count2) ans++;
                count1 = 0;
                count2 = 0;
            }
            return ans;
        }
    }
}
