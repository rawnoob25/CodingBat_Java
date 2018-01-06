public int sumDigits(String str) {
  int n = str.length();
  int tot = 0;
  for(int i = 0; i<n; i++){
    char c = str.charAt(i);
    if(Character.isDigit(c)){
      tot += Integer.parseInt(""+c);
    }else{
      continue;
    }
  }
  return tot;
}
