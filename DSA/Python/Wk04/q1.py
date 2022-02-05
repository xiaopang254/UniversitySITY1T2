def GCD(n,m):
  # remove pass and insert your code here
  # for hte purpose of this exercise you should
  # call the function GCD() with a smaller value of
  # the parameters appropriately.
    if (m <= n and n % m == 0):
        return m;
    
    elif (n<m):
        return GCD(m,n)
        
    else:
        return GCD(m, n % m)
    
n1 = int(input("Enter the first number:\n"))
n2 = int(input("Enter the second number:\n"))    

print("The GCD of", n1, "and", n2, "is", GCD(n1,n2))