public int sumNumbers(String str) {
  int n = str.length();
  if(n==0){
    return 0;
  }
  int i = 0;
  int tot = 0;
  while(i<n){
    if(Character.isDigit(str.charAt(i))){
      int j = i+1;
      while(j<n && Character.isDigit(str.charAt(j))){
        j+=1;
      }
      tot+=Integer.parseInt(str.substring(i,j));
      i=j; 
    }else{
      i+=1;
    }
  }
  return tot;
}
