public boolean groupSum(int start, int[] nums, int target) {
  if(target==0){
    return true;
  }
  int n = nums.length;
  if(start>=n){
    return false;
  }
  //the number at nums[start] may either be included or excluded;
  //both of these possibilities are considered in the recursive calls.
  //
  //This is quite similar to the 0-1 knapsack problem.
  return groupSum(start+1,nums, target)||groupSum(start+1,nums, target-nums[start]);
}
