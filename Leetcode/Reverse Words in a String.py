# 151. Reverse Words in a String

# Runtime: 1ms 
class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        words = s.split() 
        length = len(words)
        
        for i in range(length - 1, -1, -1):
            result.append(words[i])

        return " ".join(result)
    

#Runtime: 0ms
class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        # Split the string into words
        words = s.split()
        
        # Reverse the list of words
        reversed_words = words[::-1]
        
        # Join the reversed words with spaces
        reversed_string = ' '.join(reversed_words)
        
        return reversed_string