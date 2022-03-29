
print("Printing odd numbers in descending order from 102 to 66")

#Start,Stop,Steps
for i in range(102,65,-1):
    #To check if it is a odd number, modulus by 2 and there should be remainder.
    if(i%2 != 0):
        print("Odd numbers: ", i)