public int strDist(String str, String sub) {
  int n = str.length(), m = sub.length();
  if(n<m){
    return 0;
  }
  if(str.startsWith(sub)&&str.endsWith(sub)){
    return str.length();
  }else if(str.startsWith(sub)){
    return strDist(str.substring(0, n-1), sub);
  }else if(str.endsWith(sub)){
    return strDist(str.substring(1), sub);
  }else{
    if(str.length()==1){ //handle single element string str on which
    //if str.substring(1,n-1) is invoked, will throw an IndexOutOfBoundsException
      if(!str.equals(sub))
        return 0;
      else
        return 1;
    }
    return strDist(str.substring(1,n-1), sub);
  }
}
