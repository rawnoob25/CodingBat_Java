public boolean gHappy(String str) {
  int n = str.length();
  if(n<2){
    if(str.contains("g"))
      return false;
    return true;
  }
  int i = 0;
  while(i<n) {
    char c = str.charAt(i);
    if(c=='g'){
      if(i==0){
        if(str.charAt(i+1)!='g')
          return false;
      }else if (i==n-1){
        if(str.charAt(i-1)!='g')
          return false;
      }else{
        if(!(str.charAt(i-1)=='g'||str.charAt(i+1)=='g'))
          return false;
      }
    }
    i += 1;
  }
  return true;
} 
