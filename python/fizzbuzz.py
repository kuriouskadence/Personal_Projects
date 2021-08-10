
from coding function import main
import sys
# `If I plug into your function, 4 numbers, 
# if specific number is divisible by num1, then return or print 'fizz'
# if specific number is divisible by num2, then return or print 'buzz'
# if specific number is divisible by both, return or print 'fizzbuzz'
# have the program loop through numbers num3 to num4
# i range (num3,num4 + 1)
# divisible - 10 % 5 == 0 
#if specific number % num(1-4) == 0 

def fizzbuzz(num1,num2,num3,num4):
    for fizzbuzz in range (0,4):
        if(fizzbuzz % num1 == 0) and (fizzbuzz % num2 == 0):
            print('fizzbuzz')
        elif fizzbuzz % num1 == 0:
            print('fizz')
        elif fizzbuzz % num2 == 0:
            print('buzz')
        
        
        
    if __name__ == '__main__':
        fizzbuzz(int(sys.argv[1]),int(sys.argv[2]),int(sys.argv[3]),int(sys.arv[4]))
