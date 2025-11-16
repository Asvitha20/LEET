char* toHex(int num) {
    char *temp = calloc(9, sizeof(char));
    if (!temp) 
        return NULL;

    sprintf(temp, "%x", num);

    size_t len = strlen(temp) + 1;
    char *res = realloc(temp, len);
    if (!res) 
    {
        free(temp);
        return NULL;
    }

    return res;
}