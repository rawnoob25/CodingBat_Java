public int maxBlock(String str) {
  int n = str.length();
  if(n<2)
    return n;
  int hi = 1;
  boolean inBlock = false;
  int i = 1;
  int ct=1;
  while(i<n){
    if(!inBlock && str.charAt(i-1)==str.charAt(i)){
      inBlock = true;
      ct = 2;
      hi = Math.max(hi, ct);
    }else if(inBlock && str.charAt(i-1)!=str.charAt(i)){
      inBlock = false;
      hi = Math.max(hi, ct);
    }else if(inBlock){
      ct++;
      hi = Math.max(hi, ct);
    }else;
    i++;
  }
  return hi;
}
