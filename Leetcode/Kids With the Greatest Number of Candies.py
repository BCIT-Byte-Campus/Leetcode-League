# 1431. Kids With the Greatest Number of Candies

class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        max_candy = max(candies)
        result = []
        for candy in candies:
            result.append(candy+extraCandies >= max_candy)
        
        return result