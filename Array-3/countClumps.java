public int countClumps(int[] nums) {
  int n = nums.length;
  if(n<2){
    return 0;
  }
  int clumpCt = 0;
  boolean inClump = false;
  for(int i=0;i<n-1;i++){
     int v = nums[i];
     if(!inClump && v==nums[i+1]){
       inClump = true;
       clumpCt++;
     } else if (v!=nums[i+1]){
       inClump = false;
     } else {
       continue;
     }
  }
  return clumpCt;
}
