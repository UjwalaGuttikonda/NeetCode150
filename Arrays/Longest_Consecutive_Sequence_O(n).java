class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int num:nums)
        {
            hash.add(num);
        }
        int max_seq=0;
        for(int i=0;i<nums.length;i++)
        {
          int current = nums[i];
          int current_seq = 1;

          if(!hash.contains(current-1)){
          while(hash.contains(current+1))
          {
              current++;
              current_seq++;
          }
        
          max_seq = Math.max(max_seq, current_seq);
        }
        }
        return max_seq;
        
    }
}