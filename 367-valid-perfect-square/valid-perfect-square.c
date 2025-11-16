bool isPerfectSquare(int num) {
    long long i,n;
    n=num;
    if(num==1)
    return true;

    for(i=1;i<n;i++)
    {
        
        if((i*i)==n)
        return true;

        if(i*i>n)
        return false;
    }
    return false;
}