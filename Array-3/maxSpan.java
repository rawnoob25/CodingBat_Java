public int maxSpan(int[] nums) {
  int n = nums.length, i = 0;
  if(n==0){
    return 0;
  }
  int highSpan = 1;
  while(i<n){
    int j = n-1;
    while(j>i && nums[j]!=nums[i]){
      j-=1;
    }
    highSpan = Math.max(j - i +1, highSpan);
    i+=1;
  }
  return highSpan;
}
