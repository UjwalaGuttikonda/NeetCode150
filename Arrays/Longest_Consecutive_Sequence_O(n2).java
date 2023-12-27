class Solution {
    public int longestConsecutive(int[] nums) {
        int max_seq=0;
        for(int i=0;i<nums.length;i++)
        {
          int current = nums[i];
          int current_seq = 1;
          while(numberExists(nums, current+1))
          {
              current++;
              current_seq++;
          }
          max_seq = Math.max(max_seq, current_seq);
        }
        return max_seq;
        
    }

    private boolean numberExists(int[] arr, int num)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]==num)
            return true;
        }
        return false;
    }
}