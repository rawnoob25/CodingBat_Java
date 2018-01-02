public int countHi(String str) {
  int n = str.length();
  if(n<2){
    return 0;
  }
  if (str.substring(0,2).equals("hi")) {
    return 1+countHi(str.substring(2));
  } else if (str.charAt(1)=='h') {
    return countHi(str.substring(1));
  } else {
    return countHi(str.substring(2));
  }
}
