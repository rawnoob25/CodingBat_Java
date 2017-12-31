public int[] squareUp(int n) {
  int [] out = new int[n*n];
  int idx = 0;
  for(int i=1;i<=n;i++){
    for(int j=0;j<n-i;j++){
      out[idx++]=0;
    }
    for(int k=i;k>=1;k--){
      out[idx++]=k;
    }
  }
  return out;
}