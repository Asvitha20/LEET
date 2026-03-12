class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String a : words){
            res.append(new StringBuilder(a).reverse()).append(" ");
        }
        return res.toString().trim();
    }
}