class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int res = 1;
        for(int i=0; i<nums.length-1; i++){
            int next = i+1;
            if(nums[i] == nums[next]){
                continue;
            }

            if(nums[i]+1 == nums[next]){
                count++;
                res = Math.max(res, count);
            }else{
                count = 1;
            }
        }
        return res;
    }
}