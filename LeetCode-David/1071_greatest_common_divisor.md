## [Array / String] 1071. Greatest Common Divisor of Strings 

### My solution
Runtime: 16 ms

```sh
class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        if str1 == str2:
            return str1
        elif len(str1) < len(str2):
            return self.gcdOfStrings(str2, str1)
        elif not str1.startswith(str2):
            return ''
        else:
            return self.gcdOfStrings(str1[len(str2):], str2)
```

### Example 4 ms submission
```sh


class Solution(object):
    def divisible(self, s, t):
        return s + t == t + s

    def gcd(self, a, b):
        while b != 0:
            a, b = b, a % b
        
        return abs(a)
    
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        a = len(str1)
        b = len(str2)
        c = self.gcd(a,b)
        x = ""

        i = 0
        while i < c:
            if str1[i] == str2[i]:
                x += str1[i]
                i += 1
            else:
                break
        
        while len(x) > 0:
            if self.divisible(str1, x) and self.divisible(str2, x):
                return x
            else:
                x = x[:-1]
        
        return x
```