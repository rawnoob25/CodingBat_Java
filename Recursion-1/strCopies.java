public boolean strCopies(String str, String sub, int n) {
  if(n==0){
    return true;
  }else if(str.length()==0 && n!=0){
    return false;
  }
  int k = 0;
  if(str.startsWith(sub)){
    k=1;
  }
  return strCopies(str.substring(1),sub,n-k);
}
