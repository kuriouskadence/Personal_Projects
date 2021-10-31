public class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;
            for(int i = 0; i < s.length(); i++){
                if (s.charAt(i) ==
                    length = s.charAt(i).length;
                }
            }return length;
        }
}
