class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        int s_length = s.length();
        int t_length = t.length();
        if(s_length==t_length){
            char[] baal = new char[s_length];
            char[] baal2 = new char[t_length];
            for(int idk=0;idk<s_length;idk++){
                baal[idk] = s.charAt(idk);
            }
            for(int fml=0;fml<t_length;fml++){
                baal2[fml] = t.charAt(fml);
            }
            for(int i=0;i<s_length;i++){
                freq[baal[i]-'a']++;
            }
            for(int k=0;k<t_length;k++){
                freq2[baal2[k]-'a']++;
            }
            for(int l=0;l<26;l++){
                if(freq[l]!=freq2[l]){
                    return false;
                }
            }
            return true;
        }
        else return false;
    }
}
