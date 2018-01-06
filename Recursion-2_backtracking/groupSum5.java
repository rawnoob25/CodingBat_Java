public boolean groupSum5(int start, int[] nums, int target) {
  int n = nums.length;
  if(start>=n ){
    if(target!=0){
      return false;
    }
    return true;
  }
  int v = nums[start];
  if(v%5==0){
    return groupSum5(start+1, nums, target - v);
  }else if(v == 1 & start!=0 && nums[start-1]%5==0){
    return groupSum5(start+1, nums, target);
  }else{
    return groupSum5(start+1, nums, target-v)||groupSum5(start+1, nums, target);
  }
}