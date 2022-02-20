#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'migratoryBirds' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def migratoryBirds(arr):
    # Write your code here

    #Dynamically create empty list, depending on the size of the input arr.
    #If inside the input arr has the same number, +1 the array_counter of the same index.
    #index = value, E.g: array says there is value "4", add 1 into array_counter[4]
    array_counter = [0] * len(arr)
    for i in arr:
        array_counter[i] += 1

    #Also, use "LESS THAN" to ensure that the same counting value of a higher value will not be counted
    #E.g: value 2 and value 5 have the same frequency of 10. Pick Value 2.
    min = array_counter[0]
    index = 0
    for j in range(0,len(array_counter)):
        if min < array_counter[j]:
            min = array_counter[j]
            index = j
    return index

if __name__ == '__main__':
    # fptr = open(os.environ['OUTPUT_PATH'], 'w')

    #arr_count = int(input().strip())

    #arr = list(map(int, input().rstrip().split()))
    arr = [1,4,4,4,5,3]

    result = migratoryBirds(arr)

    #fptr.write(str(result) + '\n')

    #fptr.close()
