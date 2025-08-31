int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    int s=arrivalTime+delayedTime;
    return s%24;
    
}