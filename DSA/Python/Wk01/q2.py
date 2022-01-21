def reverse(a):
    maxCount = len(a)
    min = 0
    max = len(a)-1
    buffer = 0
    while(min < max):
        buffer = a[min]
        a[min] = a[max]
        a[max] = buffer
        min += 1
        max -= 1
        
array = input("Enter a list of numbers separated by commas:\n")
array = [int(x) for x in array.split(",")]

reverse(array)
print (array)