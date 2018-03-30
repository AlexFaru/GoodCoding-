class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int targ=nums[0]+nums[1]+nums[2]; //Pick any combination of three elements
        
        for(int i=0;i<nums.length-2;i++){
            if(i==0 ||(nums[i-1]!=nums[i])){
                int low = i+1, hi=nums.length-1;
                while(low<hi){
                    
                    int sum =nums[i]+nums[low]+nums[hi];
                    if(Math.abs(target-(sum))<Math.abs(target-targ)){ //Check the diference
                        targ=(nums[low]+nums[hi]+nums[i]);
                    }else if (sum<target) low++;
                     else hi--; //Move indices 
                }
            }
        }
        return targ;
    }
}