public int strCount(String str, String sub) {
  int n = str.length();
  int m = sub.length();
  if(m>n)
    return 0;
  
  String s = str.substring(0, m);
  if(s.equals(sub)){
    return 1 + strCount(str.substring(m), sub);
  }
  return strCount(str.substring(1), sub);
}
