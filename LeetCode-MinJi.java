/* 1768. Merge Strings Alternately 

 * Some factors to consider:
 * -Use StringBuilder? (to avoid creating multple objeccts each time) 
 * -How to add each letter alternately (use index value?)
 * -how to handle cases when the word length is not equal
 * 
 * Results: Accepted
 * Runtime: 0 ms
 * 
 * https://leetcode.com/problems/merge-strings-alternately/solutions/3612633/simple-java-solution-from-a-beginner-for-a-beginner-runtime-0ms/
 * 
 */

class Solution {
  public String mergeAlternately(String word1, String word2) {
      // Create new StringBuilder Object
      StringBuilder mergedWord = new StringBuilder();
      // Set int variable for iteration through the length of word
      int i = 0;
      // Check to see if there are any more characters remaining
      while( i < word1.length() && i < word2.length()) {
          // Append the letters at each index alternately
          mergedWord.append(word1.charAt(i)).append(word2.charAt(i));
          // Increment to next index 
          i++;
      }

      // Because the while loop will terminate once it has reached the last letter of the shorter word
      // Append Substring of remaining characters from the longer word if any
      mergedWord.append(word1.substring(i)).append(word2.substring(i));

      // Return the merged string 
      return mergedWord.toString();
  }
}


