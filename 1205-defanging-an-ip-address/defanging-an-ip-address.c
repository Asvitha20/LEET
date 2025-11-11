
char* defangIPaddr(char* address) {
    char* ans = (char*)malloc((strlen(address) * 3 + 1) * sizeof(char)); // 3 times the length for each potential "
    int j = 0; 
    for(int i = 0; i < strlen(address); i++) {
        if(address[i] == '.') {
            ans[j++] = '[';
            ans[j++] = '.';
            ans[j++] = ']';
        } else {
            ans[j++] = address[i];
        }
    }
    ans[j] = '\0';
    return ans;
}