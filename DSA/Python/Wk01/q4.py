#question 4
def orderInsert(a,value):
    for i in range(len(a)-1):
        if a[i] > value:
            a.insert(i,value)
            break
    return a

array = input("Enter a list of numbers in increasing order separated by commas:\n")
array = [int(x) for x in array.split(",")]

number = input("Enter a number to be inserted into the array:\n")

orderInsert(array, int(number))
print(array)