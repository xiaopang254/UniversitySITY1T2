#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'superDigit' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. STRING n
#  2. INTEGER k

def superDigit(n,k):
    totalValue = 0
    for i in n:
        totalValue += int(i)
    totalValue = int(totalValue) * k
    k = 1
    if totalValue > 9:
        return superDigit(str(totalValue), k)
    else:
        return totalValue

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = first_multiple_input[0]

    k = int(first_multiple_input[1])

    result = superDigit(n, k)
    print(result)

    # fptr.write(str(result) + '\n')

    # fptr.close()
