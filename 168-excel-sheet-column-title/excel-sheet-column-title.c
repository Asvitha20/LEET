char* convertToTitle(int columnNumber) {
    int length = 7;
    int c = columnNumber;
    static char p[8];
    p[length] = '\0';
    while(c)
    {
        c -= 1;
        p[--length] = 'A' + c%26;
        c /= 26;
    }
    return p + length;

}