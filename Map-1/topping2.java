public Map<String, String> topping2(Map<String, String> map) {
  if(map.containsKey("ice cream")){
    map.put("yogurt", map.get("ice cream"));
  }
  map.replace("spinach", "nuts");
  return map;
}
