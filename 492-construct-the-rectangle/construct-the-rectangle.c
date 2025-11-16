/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* constructRectangle(int area, int* returnSize) {
     int* a = (int*)malloc(2 * sizeof(int));
    int root = (int)sqrt(area);

    for (int i = root; i > 0; i--) {
        if (area % i == 0) {
            a[0] = area / i;
            a[1] = i;
            *returnSize = 2;
            return a;
        }
    }
    return a; // will never reach here, since area is always divisible by 1
}