import java.util.Deque;
import java.util.LinkedList;
public String sameEnds(String string) {
  int n = string.length();
  if(n==0){
    return "";
  }
  char c = string.charAt(0);
  Deque<Integer> d = new LinkedList<>();
  int j = n-1;
  
  while(j>0){ //loop to add all the end instance search starting points
    if(string.charAt(j)==c){
      d.addFirst(j);
    }
    j-=1; 
  }
  while(!d.isEmpty()){ //loop for search beginning at each starting point
    int idx = d.removeFirst();
    int searchBackPtr = idx;
    int i = 0;
    while(i<idx && searchBackPtr<n){
      if(string.charAt(i)!=string.charAt(searchBackPtr)){
        break;
      }else if(searchBackPtr==n-1){
        return string.substring(idx);
      }else{
        searchBackPtr+=1;
        i+=1;
      }
    }
  }
  return "";
}