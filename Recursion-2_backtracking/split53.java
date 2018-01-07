/*Note that a number that is neither a multiple of 5 nor 3 may be
in either group.*/
public boolean split53(int[] nums) {
  return split53Better(nums, 0, 0);
}

private boolean split53(int[] nums, int start, int sum5s, int sum3s){
  int n = nums.length;
  if(start==n){
    return sum5s==sum3s;
  }
  int v = nums[start];
  if(v%5==0){
    return split53(nums, start+1,sum5s+v, sum3s);
  }else if (v%3==0){
    return split53(nums, start+1, sum5s, sum3s+v);
  }else{
    return split53(nums, start+1, sum5s+v, sum3s)||split53(nums, start+1, sum5s, sum3s+v);
  }
}

/*
this version of the function either increments or decrements the tot parameter depending
upon which group nums[start] is inserted into
*/
private boolean split53Better(int[] nums, int start, int tot){
  int n = nums.length;
  if(start == n){
    return tot == 0;
  }
  int v = nums[start];
  if(v%5==0){
    return split53Better(nums, start+1, tot+v);
  } else if (v%3==0){
    return split53Better(nums, start+1, tot-v);
  } else{
    return split53Better(nums, start+1, tot+v)||split53Better(nums, start+1, tot-v);
  }
}