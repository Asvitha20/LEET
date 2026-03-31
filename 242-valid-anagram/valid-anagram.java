class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hs=new HashMap<>();
        
        HashMap<Character,Integer>ht=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
             char ch=t.charAt(i);
            ht.put(ch,ht.getOrDefault(ch,0)+1);
        }
        if(hs.equals(ht)){
            return true;
        }
        return false;
    }
}