public String stringClean(String str) {
  int n = str.length();
  if(n<2){
    return new String(str);
  }
  char first = str.charAt(0);
  if(first==str.charAt(1)){
    return stringClean(str.substring(1));
  }else{
    return first+stringClean(str.substring(1));
  }
}
