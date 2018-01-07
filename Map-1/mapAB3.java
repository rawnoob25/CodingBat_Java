public Map<String, String> mapAB3(Map<String, String> map) {
  if(map.containsKey("a")^map.containsKey("b")){
    if(!map.containsKey("a")){
      map.put("a", map.get("b"));
    } else{
      map.put("b", map.get("a"));
    }
  }
  return map;
}
