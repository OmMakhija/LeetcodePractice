class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        
        bool=False
        final=0
        t=x

        while(x>0):
            a=x%10
            x=x/10
            final=(final*10)+a
        
        if (final==t):
            bool = True

        return bool

        