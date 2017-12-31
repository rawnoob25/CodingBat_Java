/*
NOTE: THERE'S A BIT OF AMBIGUITY IN THE PROBLEM STATEMENT
AS IT'S PRESENT ON THE CODINGBAT WEBSITE.
That having been said, this implementation passes
all of the autograder's tests.
*/

public boolean nestParen(String str) {
  int n = str.length();
  if(n==0){
    return true;
  }
  if(n==1){
    return false;
    /*if(Arrays.asList(new String[]{"(",")"}).contains(str)) //test for unmatched parenthesis
      return false; 
    else
      return true;*/
  } else if (str.charAt(0)=='(' && str.charAt(n-1)!=')'){
    return false;
  } else if (str.charAt(n-1)==')' && str.charAt(0)!='('){
    return false;
  } else if (str.charAt(0)!='(' || str.charAt(n-1)!=')'){
    return false;
  } 
  else {
    return nestParen(str.substring(1,n-1));
  }
}
