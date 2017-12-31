public String parenBit(String str) {
  int n = str.length();
  if(str.charAt(0)=='(' && str.charAt(n-1)==')'){
    return str;
  }else if(str.charAt(0)=='('){
    return parenBit(str.substring(0,n-1));
  }else if(str.charAt(n-1)==')'){
    return parenBit(str.substring(1));
  }else{
    return parenBit(str.substring(1,n-1));
  }
}
