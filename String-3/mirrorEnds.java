public String mirrorEnds(String string) {
  int n = string.length();
  if(n<2){
    return string;
  }
  int i = 0, j = n-1;
  while(i<=j && string.charAt(i)==string.charAt(j)){
    i++;
    j--;
  }
  if(j<i){
    return string;
  }
  return string.substring(0,i);
}
