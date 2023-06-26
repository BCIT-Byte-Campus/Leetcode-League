## [Array / String] 1768. Merge Strings Alternately

### My solution
Runtime: 18 ms

```sh
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        final = ""
        length1 = len(word1)
        length2 = len(word2)
        min_length = min(length1, length2)

        for i in range(min_length):
            final += word1[i]
            final += word2[i]

        if length1 > min_length:
            final += word1[min_length:]
        elif length2 > min_length:
            final += word2[min_length:]

        return final
```

### Example 3 ms submission
```sh
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        merged = ''
        i = 0
        j = 0
        while i < len(word1) and j < len(word2):
            merged += word1[i] + word2[j]
            i += 1
            j += 1
        if i < len(word1):
            merged += word1[i:]
        elif j < len(word2):
            merged += word2[j:]
        return merged
```