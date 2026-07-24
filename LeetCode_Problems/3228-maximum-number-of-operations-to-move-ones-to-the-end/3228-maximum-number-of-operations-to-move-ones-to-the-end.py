class Solution:
    def maxOperations(self, s: str) -> int:
        
        onesTillNow = 0
        operations = 0

        for i in range(len(s)):

            if s[i] == '1':
                onesTillNow += 1

            elif i > 0 and s[i - 1] == '1':
                operations += onesTillNow

        return operations  