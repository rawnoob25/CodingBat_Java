public boolean linearIn(int[] outer, int[] inner) {
  if (inner.length==0)
    return true;
  int outerIdx = 0, innerIdx = 0;
  int innerLen = inner.length, outerLen = outer.length;
  
  int lastInner = inner[0];
  while (innerIdx < innerLen) { //only required to exhaust array inner; not required
  //to exhaust array outer
    if (outerIdx < outerLen && outer[outerIdx] < inner[innerIdx]) {
      outerIdx += 1;
    } else if (outerIdx < outerLen && outer[outerIdx] == inner[innerIdx]) {
      lastInner = inner[innerIdx];
      outerIdx+=1; 
      innerIdx+=1;
    } else if (innerIdx!=0 && inner[innerIdx]==lastInner){ //already seen duplicate in inner array
      innerIdx+=1;  
    } else {
      return false;
    }
  }
  return true;
}
