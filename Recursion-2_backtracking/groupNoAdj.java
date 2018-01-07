public boolean groupNoAdj(int start, int[] nums, int target) {
  int n = nums.length;
  if(start>=n){
    return target==0;
  }
  int v = nums[start];
  return groupNoAdj(start+2, nums, target - v)||groupNoAdj(start+1, nums, target);
}
