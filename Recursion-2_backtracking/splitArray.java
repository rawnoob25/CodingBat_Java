public boolean splitArray(int[] nums) {
  return splitArray(nums, 0, 0);
}

private boolean splitArray(int[]nums, int start, int tot){
  int n = nums.length;
  if(start==n){
    return tot == 0;
  }
  int v = nums[start];
  return splitArray(nums, start+1, tot-v)||splitArray(nums, start+1, tot+v);
}