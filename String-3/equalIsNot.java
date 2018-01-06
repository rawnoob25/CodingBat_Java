public boolean equalIsNot(String str) {
  int isCt = 0;
  int notCt = 0;
  int i = 0;
  int n = str.length();
  while(i<n-2){
    if(str.substring(i,i+3).equals("not")) {
      notCt++;
      i+=3;
    }else if(str.substring(i,i+2).equals("is")){
      isCt++;
      i+=2;
    }else{
      i+=1;
    }
  }
  if(str.substring(i).equals("is"))
    isCt++;
  return isCt==notCt;
}
