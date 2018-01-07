public Map<String, String> mapShare(Map<String, String> map) {
  if(map.containsKey("a")){
    String v=map.get("a");
    map.put("b",v);
  }
  map.remove("c");
  return map;
}
