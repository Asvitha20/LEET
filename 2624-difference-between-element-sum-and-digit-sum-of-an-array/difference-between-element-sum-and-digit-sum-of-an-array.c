int differenceOfSum(int* nums, int numsSize) {
    int a = 0, b = 0;
    size_t len = 0;
    char str[5];

    for (int i = 0; i < numsSize; i++){
        a += nums[i];
    }

    for (int i = 0; i < numsSize; i++){
        sprintf(str, "%d", nums[i]);
        len = strlen(str);
        for (int j = 0; j < len; j++) {
            b += str[j] - '0';
        }
    }

    return abs(a - b);
}