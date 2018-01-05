public int array11(int[] nums, int index) {
  int n = nums.length;
  if(index>=n){
    return 0;
  }
  int v = 0;
  if(nums[index]==11)
    v = 1;
  return v + array11(nums, index+1);
}
