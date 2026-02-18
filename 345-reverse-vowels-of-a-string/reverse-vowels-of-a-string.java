class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(left<right&&!isVowel(arr[left])){
                left++;
            }else if(left<right&&!isVowel(arr[right])){
                right--;
            }else if(isVowel(arr[left])&& isVowel(arr[right])){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    private Boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}