public int maxMirror(int[] nums) {
  int n = nums.length;
  if(n<2){
    return n;
  }
  int maxMirrorLen = 0;
  int lb = 0; //lb is lo bound 
  while(lb<n-1){
    int hb = n-1; //hb is hi bound
    while(hb>lb){
      int lr = lb, hr = hb;
      while(hr>=lr){
        if(nums[lr]==nums[hr]){
          if(lr==hr){
            maxMirrorLen = Math.max(2*(lr-lb)+1, maxMirrorLen);
            break;
          } else if(lr+1==hr){
            maxMirrorLen = Math.max(2*(lr-lb+1), maxMirrorLen);
            break;
          } else{
            lr++; hr--;
          }
        } else{
          maxMirrorLen = Math.max(lr - lb, maxMirrorLen);
          break;
        }
      }
      hb--;
    }
    lb++;
  }
  return maxMirrorLen;
}
