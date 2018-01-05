public String withoutString(String base, String remove) {
  StringBuilder sb=new StringBuilder();
  int n = base.length(), m = remove.length(), i = 0;
  if(n<m){
    return base;
  }
  while(i<=n-m){
    String baseString = base.substring(i,i+m).toLowerCase();
    String cmpString = remove.toLowerCase();
    if(baseString.equals(cmpString)){
      i+=m;
    }else{
      sb.append(base.charAt(i));
      i+=1;
    }
  }
  sb.append(base.substring(i));
  return sb.toString();
}
