public int bunnyEars(int bunnies) {
  if(bunnies<2)
    return 2*bunnies;
  else 
    return 2 + bunnyEars(bunnies - 1);
}
