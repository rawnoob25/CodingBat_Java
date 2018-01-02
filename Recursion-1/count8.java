public int count8(int n) {
  if (n==0) {
    return 0;
  } 
  int v = 0;
  if (n%100==88){
    v=2;
  } else if (n%10==8) {
    v=1;
  } else;
  return v + count8(n/10);
}
