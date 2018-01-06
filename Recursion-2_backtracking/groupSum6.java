public boolean groupSum6(int start, int[] nums, int target) {
  int n = nums.length;
  if(start>=n){
    return target == 0;
  }
  int v = nums[start];
  if(v==6){
    return groupSum6(start+1, nums, target-v);
  }else{
    return groupSum6(start+1, nums, target-v)||groupSum6(start+1,nums,target);
  }
}
