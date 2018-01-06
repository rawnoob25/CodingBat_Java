public int countTriple(String str) {
  int n = str.length();
  if(n<3){
    return 0;
  }
  int i = 0;
  int ct = 0;
  while(i<n-2){
    if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
      ct++;
    }
    i++;
  }
  return ct;
}
