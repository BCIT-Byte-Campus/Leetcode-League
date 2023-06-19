// First Attempt _ Time Limit Exceeded
class Solution {
    public String mergeAlternately(String word1, String word2) {
        //Initialize
        String merged = "";
        int num = 0;
        while(num < word1.length() && num < word2.length()){
            merged += word1;
            merged += word2;
            num++;
        }
    
        while (num < word1.length())
            merged += word1;
        while (num < word2.length())
            merged += word2;
        return merged;
        
    }
}

// Second Attempt _ Memory Limit Exceeded
class Solution {
    public String mergeAlternately(String word1, String word2) {
        //Initialize
        StringBuilder merged = new StringBuilder();
        int num = 0;
        while(num < word1.length() && num < word2.length()){
            merged.append(word1);
            merged.append(word2);
            num++;
        }
    
        while (num < word1.length())
            merged.append(word1);
        while (num < word2.length())
            merged.append(word2);
         return merged.toString();
    }
}

// Accepted
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);
        
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                merged.append(word1.charAt(i));
            }
            if (i < length2) {
                merged.append(word2.charAt(i));
            }
        }
        return merged.toString();
    }
}