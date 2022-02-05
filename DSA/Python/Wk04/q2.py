#if mod is even, then + 1/n
#if mod is odd, then - 1/n

# def sumNTerm(n):
#     if(n == 1):
#         return 1.0

#     #even number
#     if (n % 2 == 0):
#         return  1/n + sumNTerm(n-1)

#     #odd number
#     else:
#       return  -1/n + sumNTerm(n-1)

def sumNTerm(n):
    if(n == 1):
        return 1.0
    this_iteration = 0

    #even number
    if (n % 2 == 0):
        this_iteration = 1/n

    #odd number
    else:
        this_iteration = -1/n

    return this_iteration + sumNTerm(n-1)
   
n = int(input("Enter the number of terms to sum:\n"))

print("Sum of first",n,"terms =", sumNTerm(n))