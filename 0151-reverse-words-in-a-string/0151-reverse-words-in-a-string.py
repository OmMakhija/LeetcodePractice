class Solution(object):
    def reverseWords(self, s):
        arr = s.split()
        st = " ".join(arr[::-1])
        return st