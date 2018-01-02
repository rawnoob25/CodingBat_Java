public boolean array220(int[] nums, int index) {
  int n = nums.length;
  if(index>=n-1){
    return false;
  } else if(nums[index+1]==10*nums[index]) {
    return true;
  } else {
    return array220(nums,index+1);
  }
}

