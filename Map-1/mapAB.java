public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a") && map.containsKey("b")){
    String m = map.get("a"), n = map.get("b");
    map.put("ab",m+n);
  }
  return map;
}
