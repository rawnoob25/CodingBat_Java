public int countPairs(String str) {
  int n = str.length();
  if(n<3){
    return 0;
  }
  int k = 0;
  if(str.charAt(0)==str.charAt(2)){
    k = 1;
  }
  return k+countPairs(str.substring(1));
}
