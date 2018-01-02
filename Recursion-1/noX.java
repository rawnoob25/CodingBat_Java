public String noX(String str) {
  int n = str.length();
  if(n<1){
    return str;
  }
  String first = "";
  if(!str.substring(0,1).equals("x")) {
    first = str.substring(0,1);
  }
  if(n==1){
    return first;
  }
  return first+noX(str.substring(1));
}
