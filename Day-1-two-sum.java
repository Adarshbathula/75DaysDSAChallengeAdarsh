import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r[]=new int[2];
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int h=target-nums[i];
            if(hm.containsKey(h)){
                 r[0]=i;
                 r[1]=hm.get(h);
                 return r;
            }
            else hm.put(nums[i],i);
        }
        return r;
    }
}