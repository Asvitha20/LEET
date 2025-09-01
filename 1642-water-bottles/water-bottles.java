class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int c= numBottles;
   while(numBottles>=numExchange){
    int a=numBottles/numExchange;
    c+=a;
    numBottles=(numBottles%numExchange)+a;
   }
   return c;
    }
}