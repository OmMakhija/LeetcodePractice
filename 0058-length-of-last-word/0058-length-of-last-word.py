class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr=s.split()
        n=len(arr)
        word=arr[n-1]
        return len(word)
        