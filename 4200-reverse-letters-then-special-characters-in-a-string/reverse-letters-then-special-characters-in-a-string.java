class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(Character.isLetter(arr[left])&&Character.isLetter(arr[right])){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }else if(!Character.isLetter(arr[left])){
                left++;
            }else if(!Character.isLetter(arr[right])){
                right--;
            }
        }
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(!Character.isLetter(arr[l])&&!Character.isLetter(arr[r])){
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }else if(Character.isLetter(arr[l])){
                l++;
            }else if(Character.isLetter(arr[r])){
                r--;
            }
        }
        return new String(arr);
    }
}