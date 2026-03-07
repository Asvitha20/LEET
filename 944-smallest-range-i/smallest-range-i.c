int smallestRangeI(int* nums, int numsSize, int k) {
    int min = nums[0], max = nums[0];
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] < min)
            min = nums[i];
        if (nums[i] > max)
            max = nums[i];
    }
    int ans = max - min, i, j, temp;
    for (i = 0; i <= k; i++) {
        for (j = 1; j <= k; j++) {
            temp = (max - i) - (min + j);
            if (ans > temp && temp >= 0)
                ans = temp;
        }
    }
    return ans;
}