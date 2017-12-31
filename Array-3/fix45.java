public int[] fix45(int [] nums) {
  int [] out = new int[nums.length];
  int n = nums.length;
  int idx = 0;
  for(int v:nums){
    out[idx++] = v;
  }
  List<Integer>fivesOutOfPlace = new LinkedList<Integer>();
  List<Integer>after4sNot5 = new LinkedList<Integer>();
  int i = 0;
  while(i<n){
    int v = out[i];
    if (v==5 && ((i==0)||out[i-1]!=4)){
      fivesOutOfPlace.add(i);
    } else if (v==4 && (out[i+1]!=5)){
      after4sNot5.add(i+1);
    } else;
    i+=1;
  }
  assert fivesOutOfPlace.size() == after4sNot5.size();
  int outOfPlaceLen = fivesOutOfPlace.size();
  i=0;
  while(i<outOfPlaceLen){
    int temp = out[fivesOutOfPlace.get(i)];
    out[fivesOutOfPlace.get(i)] = out[after4sNot5.get(i)];
    out[after4sNot5.get(i)] = temp;
    i+=1;
  }
  return out;
}
