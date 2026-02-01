class Solution(object):
    def divide(self, dividend, divisor):
        if dividend == 0: 
            return 0
        if divisor == 0: 
            return 2147483647
        
        if dividend == -2147483648 and divisor == -1:
            return 2147483647

        negative = (dividend < 0) != (divisor < 0)

        a = abs(dividend)
        b = abs(divisor)

        ans = 0
        while a >= b:
            temp, multiple = b, 1
            while a >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            a -= temp
            ans += multiple

        return -ans if negative else ans
