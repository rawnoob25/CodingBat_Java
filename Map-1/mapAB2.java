public Map<String, String> mapAB2(Map<String, String> map) {
  if(map.containsKey("a")&&map.containsKey("b")){
    String m = map.get("a"), n = map.get("b");
    if(m.equals(n)){
      map.remove("a");
      map.remove("b");
    }
  }
  return map;
}
