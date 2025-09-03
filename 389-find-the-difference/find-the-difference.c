char findTheDifference(char* s, char* t) {
    int s1=0;
    int s2=0;
    for(int i=0;s[i]!='\0';i++){
        s1=s1+s[i];
    }
    for(int i=0;t[i]!='\0';i++){
        s2=s2+t[i];
    }
    int c=s2-s1;
    return (char) c;
}