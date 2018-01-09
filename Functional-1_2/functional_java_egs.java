/*
Covers problems on CodingBat.com java in both Functional-1 and FUnctional-2
sections.
*/


/*
Note: The string.replaceAll(<regex:String>,<replacement:String>) might be
useful for some of these problems. In particular, when you have an array of Strings,
and for each String in the array you want to remove all of a certain character 
or if you want to replace all instances of a character sequence in each String
with another character sequence, the string.replaceAll() instance method will 
definitely come in handy.
*/

/*
Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) -> ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) -> ["a", "bb", "c"]
noX(["x"]) -> [""]
*/
public List<String> noX(List<String> strings) {
  return strings.stream().map(x->x.replaceAll("x","")).collect(Collectors.toList());
}





/*
Java Functional Stream example:
public List<Integer> doubling(List<Integer> nums) {
  return nums.stream()
    .map(n -> n * 2)
    .collect(Collectors.toList());
}

Applying a function to each element of a collection can either
be done using replaceAll or using a Java Functional Stream.
If using a Java Functional Stream, use the following scheme:
call stream() -> call map (passing in a lambda) -> call collect (passing
in the collection to be returned- e.g. if it's a List, you'll pass Collectors.toList()
as the parameter to collect()).

NOTE: a call to replaceAll() on the array mutates the invoking array, whereas
a use of the Java Function Stream API DOES NOT mutate the original array
and rather creaes a new one and returns it.
*/





/*

Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).

lower(["Hello", "Hi"]) -> ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) -> ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) -> ["kitten", "chocolate"]
*/
public List<String> lower(List<String> strings) {
  strings.replaceAll(x->x.toLowerCase());
  return strings;
}







/*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) -> [2, 4, 6]
doubling([6, 8, 6, 8, -1]) -> [12, 16, 12, 16, -2]
doubling([]) -> []
*/
public List<Integer> doubling(List<Integer> nums) {
  nums.replaceAll(x->2*x);
  return nums;
}


/*
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

copies3(["a", "bb", "ccc"]) -> ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) -> ["242424", "aaa", ""]
copies3(["hello", "there"]) -> ["hellohellohello", "theretherethere"]
*/
public List<String> copies3(List<String> strings) {
  strings.replaceAll(x->x+x+x);
  return strings;
}

/*

Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) -> [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) -> [6, 8, 6, 8, 1]
rightDigit([10, 0]) -> [0, 0]
*/
public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(x->x%10);
  return nums;
}

/*
USES JAVA FUNCTIONAL STREAM:

Given a list of strings, return a list where each string has "y" added at its start and end.

moreY(["a", "b", "c"]) -> ["yay", "yby", "ycy"]
moreY(["hello", "there"]) -> ["yhelloy", "ytherey"]
moreY(["yay"]) -> ["yyayy"]
*/
public List<String> moreY(List<String> strings) {
  return strings.stream().map(x->'y'+x+'y').collect(Collectors.toList());
}

/*
USES JAVA FUNCTIONAL STREAM:

Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) -> [20, 30, 40]
math1([6, 8, 6, 8, 1]) -> [70, 90, 70, 90, 20]
math1([10]) -> [110]
*/
public List<Integer> math1(List<Integer> nums) {
  return nums.stream().map(x->10*(1+x)).collect(Collectors.toList());
}


/*
FILTERING
---------
To filter, there are 2 options:
1) either use removeIf(passing in a lambda)
2) Use the Java Stream API w/ following call sequence:
<Reference to Collection>.stream().filter(<lambda>).collect(<Collection to return>)

IMPORTANT TO NOTE: the lambda passed into the filter function will
have the opposite logic from removeIf. In particular, the lambda
in filter will keep the elements for which the lembda returns true.
*/

/*

Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) -> [1, 2]
no9([9, 19, 29, 3]) -> [3]
no9([1, 2, 3]) -> [1, 2, 3]
*/
public List<Integer> no9(List<Integer> nums) {
 return nums.stream().filter(x->x%10!=9).collect(Collectors.toList()); 
}


/*
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) -> [12, 20]
noTeen([1, 14, 1]) -> [1, 1]
noTeen([15]) -> []
*/
public List<Integer> noTeen(List<Integer> nums) {
  return nums.stream().filter(x->x<13||x>19).collect(Collectors.toList());
}

/*
Given a list of strings, return a list of the strings, omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) -> ["not", "too"]
noLong(["a", "bbb", "cccc"]) -> ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) -> []
*/
public List<String> noLong(List<String> strings) {
  return strings.stream().filter(x->x.length()<4).collect(Collectors.toList());
}

/*
Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) -> ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) -> ["hi"]
noZ(["hello", "howz", "are", "youz"]) -> ["hello", "are"]
*/
public List<String> noZ(List<String> strings) {
  strings.removeIf(x->x.contains("z"));
  return strings;
}

/*
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) -> ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) -> ["a", "bb"]
no34(["ccc", "dddd", "apple"]) -> ["apple"]
*/
public List<String> no34(List<String> strings) {
  strings.removeIf(x->x.length()==3||x.length()==4);
  return strings;
}

/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) -> ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) -> ["ay", "by"]
noYY(["xx", "ya", "zz"]) -> ["xxy", "yay", "zzy"]
*/
public List<String> noYY(List<String> strings) {
  return strings.stream().map(x->x+"y").filter(x->!x.contains("yy")).collect(Collectors.toList());
}

/*
Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) -> [4, 6]
two2([2, 6, 11]) -> [4]
two2([0]) -> [0]
*/
public List<Integer> two2(List<Integer> nums) {
  return nums.stream().map(x->2*x).filter(x->x%10!=2).collect(Collectors.toList());
}

/*
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) -> [19, 11]
square56([1]) -> [11]
square56([2]) -> [14]
*/
public List<Integer> square56(List<Integer> nums) {
  return nums.stream().map(x->x*x+10).filter(x->x%10!=5 && x%10!=6).collect(Collectors.toList());
}





