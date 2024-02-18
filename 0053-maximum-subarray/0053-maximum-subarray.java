class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = 0;
        
      if(checkNegative(nums) == true)
      {
          maxSum = Integer.MIN_VALUE;
          for(int i=0; i<nums.length; i++)
          {
              maxSum = Math.max(maxSum, nums[i]);
          }
          return maxSum;
      }
       else{
           for(int i =0; i<nums.length; i++)
        {
            
            if(nums[i] + currSum < 0)
            {
                currSum = 0;
                continue;
            }
            currSum+= nums[i];
            if(maxSum<currSum)
            {
                maxSum = currSum;
            }
        }
        return maxSum;
       } 
    }
    
    public static boolean checkNegative(int[] nums)
    {
         //to check if all numbers are negative
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>0)
            {
                return false;
            }
            
        }
        return true;
    }
}