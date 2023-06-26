## [Array / String] 605. Can Place Flowers

### My solution
Runtime: 140 ms

```sh
class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        flowerbed = [0] + flowerbed + [0]
        count = 0
        for i in range(1, len(flowerbed)-1):
            if flowerbed[i-1:i+2] == [0, 0, 0]:
                flowerbed[i] = 1
                count += 1
            if count >= n:
                return True
        return False
```

### Example 111 ms submission
```sh
class Solution(object):
    def canPlaceFlowers(self, flowerbed, n):
        res = 0
        N = len(flowerbed)
        for i in range(N):
            if flowerbed[i] == 0:
                if i == 0:
                    if N == 1 or flowerbed[i + 1] == 0:
                        res += 1
                        flowerbed[i] = 1
                elif i == N - 1:
                    if flowerbed[i - 1] == 0:
                        res += 1
                        flowerbed[i] = 1
                else:
                    if flowerbed[i - 1] == 0 and flowerbed[i+1] == 0:
                        res += 1
                        flowerbed[i] = 1
        
        return res >= n
```