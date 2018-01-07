public Map<String, String> mapAB4(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")) {
    String s = map.get("a"), t = map.get("b");
    if(s!=null && t!=null){
      int m = s.length(), n = t.length();
      if(m>n){
        map.put("c", s);
      } else if (n>m){
        map.put("c", t);
      } else{
        map.replace("a","");
        map.replace("b","");
      }
    }
  }
  return map;
}
