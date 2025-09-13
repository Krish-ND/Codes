#1. Reverse a string:
s = "hello"
print(s[::-1])  # Output: 'olleh'


#2. Check for a palindrome:
def is_palindrome(s):
    return s == s[::-1]


#3. Count word frequency in a list:
from collections import Counter
words = ['apple', 'banana', 'apple']
print(Counter(words))


#4. Swap two variables:
a, b = 5, 10
a, b = b, a


#5. Fibonacci using recursion:
def fib(n):
    return n if n <= 1 else fib(n-1) + fib(n-2)


#6. Find duplicate elements:
lst = [1,2,3,2,4]
duplicates = set([x for x in lst if lst.count(x) > 1])


#7. Check if list is sorted:
def is_sorted(lst):
    return lst == sorted(lst)


#8. Flatten a 2D list:
matrix = [[1, 2], [3, 4]]
flat = [num for row in matrix for num in row]


#9. Read a file line by line:
with open('file.txt') as f:
    for line in f:
        print(line.strip())


#10. Lambda & Map usage:  
nums = [1, 2, 3]
squares = list(map(lambda x: x**2, nums)