int findComplement(int num) {
  unsigned flag=~0;
  while(flag&num){
    flag<<=1;
  }  
  return ~flag&~num;
}