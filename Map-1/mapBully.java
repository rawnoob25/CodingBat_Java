public Map<String, String> mapBully(Map<String, String> map) {
  String v = map.get("a");
  if(v!=null){ //assumes null values not allowed in the map
    map.put("b",v);
    map.replace("a","");
  }
  return map;
}
