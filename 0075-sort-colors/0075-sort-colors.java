class Solution {

 
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            int swap = 0;
            for(int j=0; j<nums.length-i-1; j++)
            {
                if(nums[j] > nums[j+1])
                {
                    nums[j] = nums[j]^nums[j+1];
                    nums[j+1] = nums[j]^nums[j+1];
                    nums[j] = nums[j]^nums[j+1];
                    swap ++;
                }
            }
            if(swap == 0)
            {
              List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
              list.stream().forEach(System.out::println);
            }
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
       list.stream().forEach(System.out::println);
        
    }
}