public class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);
            if (currentChar != '*') {
                ans.append(currentChar);
            } else {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            }
        }
        return ans.toString();
    }
}