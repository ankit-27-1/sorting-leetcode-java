class goodArr {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        boolean ans=true;
        if(n==3){
            if(nums[1]!=nums[2] || nums[0]!=1){
                return false;
            }
        }
        if(nums[0]!=1){
            return false;
        }
        if(n==1){
            return false;
        }
        if(n==2){
            if(nums[0]!=1 || nums[1]!=1){
                return false;
            }
        }
        for(int i=1;i<n-2;i++){
            if(nums[i]==nums[i-1]){
                ans=false;
            }
            else if(nums[i]!=nums[i-1]){
                if(nums[n-1]!=nums[n-2]){
                    ans=false;
                }
            }
        }
        for(int i=0;i<n-2;i++){
            if(nums[i]+1!=nums[i+1]){
                return false;
            }
        }
        return ans;
    }
}
