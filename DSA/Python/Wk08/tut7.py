import random

random.seed(1)
dataSize = int(input("Enter the size of the list:\n"))
data = [random.randint(1,dataSize) for i in range(dataSize)]
data.sort()

# iterative version of binary search
def binarySearchIterative(arr,low,high,value):
    while (low <= high):
        mid = (int)(high + low)//2
        if arr[mid] == value:
            return mid
        elif arr[mid] < value:
            low = mid + 1
        else:
            high = mid - 1
    return -1



#recursive version of binary search
def binarySearchRecursive(arr,low,high,value):
    if low>high:
      return -1
    mid = (int)(high + low)//2
    if arr[mid] > value:
        return binarySearchRecursive(arr,low,mid-1,value)
    elif arr[mid] < value:
        return binarySearchRecursive(arr,mid+1,high,value)
    else:
        return mid

print("Iterative: 9132 is at index ", binarySearchIterative(data,0,len(data)-1,9132))
print("Recursive: 9132 is at index ", binarySearchRecursive(data,0,len(data)-1,9132))