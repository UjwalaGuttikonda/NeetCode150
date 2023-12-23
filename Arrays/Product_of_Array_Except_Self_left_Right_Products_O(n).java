class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left = new int[N];
        int[] right = new int[N];
        int[] result = new int[N];

        left[0] = 1;
        right[N-1] =1;

        for(int i=1;i<N;i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }
        for(int i=N-2;i>=0;i--)
        {
            right[i] = nums[i+1] * right[i+1];
        }
        for(int i=0;i<N;i++)
        {
            result[i] = left[i] * right[i];
        }

        return result;

        
    }
}