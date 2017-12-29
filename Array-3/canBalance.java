public boolean canBalance(int[] nums) {
  int n = nums.length;
  if(n<2){
    return false;
  }
  int i=0;
  while(i<n-1){
    int lSum = 0;
    for(int j = 0; j <= i; j++){
      lSum += nums[j];
    }
    int rSum = 0;
    for(int j = i+1; j<n ; j++){
      rSum += nums[j];
    }
    if(lSum == rSum){
      return true;
    }
    i+=1;
  }
  return false;
}
