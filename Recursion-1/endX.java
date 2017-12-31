public String endX(String str) {
  int n = str.length();
  if(n<2){
    return str;
  }
  char first = str.charAt(0);
  if(first=='x'){
    return endX(str.substring(1))+'x';
  }else{
    return first+endX(str.substring(1));
  }
}
