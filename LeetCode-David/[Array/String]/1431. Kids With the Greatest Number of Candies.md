## [Array / String] 1431. Kids With the Greatest Number of Candies

### My solution
Runtime: 27 ms 

```sh
class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        final = []
        for c in candies:
            if all(c + extraCandies >= i for i in candies):
                final.append(True)
            else:
                final.append(False)
        return final
```

### Example 6 ms submission
```sh
class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        maximum = max(candies)
        ans = []
        for i in candies:
            if i+extraCandies >= maximum:
                ans.append(True)
            else:
                ans.append(False)
        return ans
```