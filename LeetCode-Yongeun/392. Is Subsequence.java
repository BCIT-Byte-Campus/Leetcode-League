class Solution {
  public boolean isSubsequence(String s, String t) {
    boolean result = false;
    if (s.isEmpty())
      result = true;

    int i = 0;
    for (final char c : t.toCharArray()) {
      if (i < s.length() && s.charAt(i) == c) {
        i++;
        if (i == s.length()) {
          result = true;
          break;
        }
      }
    }

    return result;
  }
}