from cgitb import small


def find2Smallest(a):
    smallestValue = a[0]
    twoSmallestValue = []
    for i in range(0,len(a)):
        if smallestValue >= a[i]:
            smallestValue = a[i]
    twoSmallestValue.append(smallestValue)
    a.remove(smallestValue)

    secondSmallestValue = a[0]
    for x in range(0,len(a)):
        if secondSmallestValue >= a[x]:
            secondSmallestValue = a[x]
    twoSmallestValue.append(secondSmallestValue)
    a.remove(secondSmallestValue)
            
    return tuple(twoSmallestValue)

array = input("Enter a list of numbers separated by commas:\n")
array = [int(x) for x in array.split(",")]


print("The two smallest values are:", find2Smallest(array))