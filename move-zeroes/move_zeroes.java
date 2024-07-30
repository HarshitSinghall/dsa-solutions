class Solution {
    public void moveZeroes(int[] nums) {
         
         int current = 0;
         for(int i=0; i<nums.length; i++){

            if(nums[i] != 0){
                nums[current++] = nums[i];
            }

         }

        while(current<nums.length){
            nums[current]=0;
            current++;
         }

    }
}
