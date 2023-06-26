## [Array / String] 345. Reverse Vowels of a String

### My solution
Runtime: 108 ms 

```sh
class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels_lst = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"}
        vowels = [c for c in s if c in vowels_lst][::-1]
        
        string = []
        for c in s:
            if c in vowels_lst:
                string.append(vowels.pop(0))
            else:
                string.append(c)

        return ''.join(string)
```

### Example 28 ms submission
```sh
class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = list(s)
        vows = set('aeiouAEIOU')
        l, r = 0, len(s)-1
        while l <= r:
            while l<=r and s[l] not in vows: l+=1
            while l<=r and s[r] not in vows: r-=1
            if l>r: break
            s[l], s[r] = s[r], s[l]
            l += 1
            r -=1

        return "".join(s); 
```