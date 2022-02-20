#!/bin/python3

from array import array
from heapq import merge
import math
import os
import random
import re
import sys

#
# Complete the 'closestNumbers' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def closestNumbers(arr):
    # Write your code here
    
    array_count = []
    arr.sort()
    diff = arr[1] - arr[0]
    for i in range(1,len(arr)):
        if (arr[i] - arr[i-1]) < diff:
            array_count = []
            diff = arr[i] - arr[i-1]
            array_count.append(arr[i-1])
            array_count.append(arr[i])
        elif (arr[i] - arr[i-1]) == diff:
            diff = arr[i] - arr[i-1]
            array_count.append(arr[i-1])
            array_count.append(arr[i])
    return array_count

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    # n = int(input().strip())
    
    arr = [-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854]

    # arr = list(map(int, input().rstrip().split()))

    result = closestNumbers(arr)

    # fptr.write(' '.join(map(str, result)))
    # fptr.write('\n')

    # fptr.close()
