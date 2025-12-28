double findMedianSortedArrays(int* num1, int m, int* num2, int n) {
    int a[100000];
    for(int i=0;i<m;i++){
        a[i]=num1[i];
    }
    for(int j=0;j<n;j++){
        a[m+j]=num2[j];
    }
    int l=m+n;
    for(int i=0;i<l-1;i++){
        for(int j=0;j<l-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    int med=l/2;
    if(l%2==0){
        int x=a[med];
        int z=a[med-1];
        float r=(float)(x+z)/2.0;
        return r;
    }
    return (double)a[med];
}