class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        bool=False
        seen=set()
        
        for i in nums:
            if i in seen:
                bool = True
                break
            else:
                seen.add(i)

        return bool