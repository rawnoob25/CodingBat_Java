public int[] seriesUp(int n) {
  int [] series = new int[n*(n+1)/2];
  int idx = 0;
  for(int i = 1; i <= n; i++){
    for(int j =  1; j<=i ;j++){
      series[idx++] = j;
    }
  }
  return series;
}
