bool isHappy(int n) {
   int sum=0;
   int pro=1;
   if(n==1||n==7){
    return true;
   }
   if(n<10){
    return false;
   }
  while(n>0) {
    int a=n%10;
    pro=a*a;
    sum=sum+pro;
    n=n/10;
  } 
 return isHappy(sum);
  
}