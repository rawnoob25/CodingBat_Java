public Map<String, String> topping3(Map<String, String> map) {
  if(map.containsKey("potato")){
    String v = map.get("potato");
    map.put("fries", v);
  }
  if(map.containsKey("salad")){
    String v = map.get("salad");
    map.put("spinach", v);
  }
  return map;
}
