class Solution {
  public int compress(char[] chars) {
    int result = 0;

    for (int i = 0; i < chars.length;) {
      final char letter = chars[i];
      int count = 0;
      while (i < chars.length && chars[i] == letter) {
        ++count;
        ++i;
      }
      chars[result++] = letter;
      if (count > 1)
        for (final char c : String.valueOf(count).toCharArray())
          chars[result++] = c;
    }
    return result;
  }
}