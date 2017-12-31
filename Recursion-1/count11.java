public int count11(String str) {
  int n = str.length();
  if(n<2){
    return 0;
  }
  if(str.substring(0,2).equals("11")){
    return 1+count11(str.substring(2));
  }else if(str.charAt(1)=='1'){
    return count11(str.substring(1));
  }else{
    return count11(str.substring(2));
  }
}
