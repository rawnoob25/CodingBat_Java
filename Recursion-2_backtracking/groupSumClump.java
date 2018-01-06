public boolean groupSumClump(int start, int[] nums, int target) {
  int n = nums.length;
  if(start>=n){
    return target==0;
  }
  int i = start, v = nums[start];
  
  while(i<n-1 && nums[i+1]==v){ //this loop passes thru all the adjacent equal-valued
  //elements
    i+=1;
  }
  return groupSumClump(i+1, nums, target - v*(i-start+1))||groupSumClump(i+1, nums, target); //this line ensures that either
  //all of the adjacent equal-valued elements are included or that none of them is included.
}
