class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        for (int i=0;i<len;i++){
            int a = nums[i];
            for(int j=i+1;j<len;j++){
                if(a==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
