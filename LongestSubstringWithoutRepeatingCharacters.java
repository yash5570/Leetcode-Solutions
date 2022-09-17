import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        
    }

    //O(2n) time complexity.
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        HashSet<Character> hs = new HashSet<Character>();
        int l = 0, r = 0;
        
        while(r < s.length()) {
            if(hs.contains(s.charAt(r))) {
                hs.remove(s.charAt(l));
                l++;
            } else {
                len = Math.max(len, (r - l + 1));
                hs.add(s.charAt(r));
                r++;
            }
        }
        
        return len;
    }

    //O(n) time complexity.
    public int LongestSubstringWithoutRepeatingCharactersOptimized() {
        //To do.
        return 0;
    }
}
