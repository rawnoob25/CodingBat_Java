public int countYZ(String str) {
  int n = str.length();
  if(n==0)
    return 0;

  int i = 0, ct = 0;
  while(i<n-1){
    if(!Character.isLetter(str.charAt(i+1))){
      char c = Character.toLowerCase(str.charAt(i));
      if(c=='y'||c=='z'){
        ct+=1;
      }
    }
    i+=1;
  }
  /*process final character separately*/
  char c = Character.toLowerCase(str.charAt(i));
  if(c=='y'||c=='z')
    ct+=1;
  return ct;
}
