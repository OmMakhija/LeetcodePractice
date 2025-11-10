class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        num=0
        for i in digits:
            num=(num*10)+i

        num=num+1
        digits2=[]

        while(num>0):
            a=num%10
            num=num/10
            digits2.append(a)

        return digits2[::-1]
