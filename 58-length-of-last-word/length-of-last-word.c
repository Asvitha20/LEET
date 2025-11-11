int lengthOfLastWord(char* s) {
     char *last = NULL;
    char *c = strdup(s); // safely copy string
    char *t = strtok(c, " "); // tokenize string by a space
    while(t != NULL){
        last = t;
        t = strtok(NULL, " ");
    }
    int len = last ? strlen(last) : 0;
    free(c);
    return len;
}