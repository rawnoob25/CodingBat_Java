public int countAbc(String str) {
  int n = str.length();
  if (n<3){
    return 0;
  }
  String pre = str.substring(0,3);
  if(!(pre.equals("abc")||pre.equals("aba"))){
    return countAbc(str.substring(1));
  } else if(pre.equals("abc")){
    return 1+countAbc(str.substring(3));
  } else { //pre.equals("aba")
    return 1+countAbc(str.substring(2));
  }
}
