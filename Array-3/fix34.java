public int[] fix34(int[] nums) {
  //in single loop, find the indices of elements following 3s
  //that aren't 4s and the elements preceding 4s that aren't 3s;
  //there will be the same number of each; the indices
  //will be added to 2 lists
  // then use the array indices stored in the 2 lists to swap every element following
  //a 3 that's not a 4 with a 4 that's not preceded by a 3
  
  int n = nums.length;
  int i = 0;
  List<Integer> after3sOutOfPlace = new LinkedList<Integer>();
  List<Integer> foursOutOfPlace = new LinkedList<Integer>();
  while(i<n){
    if(nums[i] == 3 && nums[i+1] != 4){
      after3sOutOfPlace.add(i+1);
    } else if(nums[i] == 4 && nums[i-1]!=3){
      foursOutOfPlace.add(i);
    } else;
    i+=1;
  }
  assert after3sOutOfPlace.size() == foursOutOfPlace.size();
  int numOutOfPlace = after3sOutOfPlace.size();
  for(int j = 0; j< numOutOfPlace; j++){
    int first = after3sOutOfPlace.get(j);
    int second = foursOutOfPlace.get(j);
    int temp = nums[first];
    nums[first] = nums[second];
    nums[second] = temp;
  }
  return nums;
}
