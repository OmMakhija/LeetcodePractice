class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        pos = True
        if x < 0:
            pos = False
            x = -x

        final = 0
        while x > 0:
            a = x % 10 
            x = x // 10  
            final = (final * 10) + a 

        if not pos:
            final = -final

        if final < -2**31 or final > 2**31 - 1:
            return 0  

        return final
                

        


            



        