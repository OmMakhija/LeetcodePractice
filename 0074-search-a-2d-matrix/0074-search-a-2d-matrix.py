class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        ans=False
        for i in matrix:
            for j in i:
                if target==j:
                    ans=True
                    
        return ans

        