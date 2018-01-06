public boolean splitOdd10(int[] nums) {
  return splitOdd10(nums, 0, 0, 0);
}

private boolean splitOdd10(int[]nums, int start, int tenCt, int oddCt){
  if(start>=nums.length){
    return tenCt%10==0 && oddCt%2==1;
  }else{
    int v = nums[start];
    return splitOdd10(nums, start+1, tenCt+v,oddCt)||splitOdd10(nums, start+1, tenCt, oddCt+v);
  }
}