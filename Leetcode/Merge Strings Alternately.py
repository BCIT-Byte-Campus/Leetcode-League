# 1768. Merge Strings Alternately

class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        w1 = len(word1)
        w2 = len(word2)

        result = []

        for i in range(min(w1,w2)):
            result.append(word1[i])
            result.append(word2[i])
        
        if w1 > w2:
            result.append(word1[w2:])
        elif w2> w1:
            result.append(word2[w1:])

        return ''.join(result)


            