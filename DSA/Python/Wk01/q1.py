# Enter your code here. Read input from STDIN. Print output to STDOUT

def findLargestIndex(a):
  largestValue = a[0]
  listCount = len(a)
  for i in range(0,len(a)):
    if (largestValue < a[i]):
      largestValue = a[i]

  largestIndex = a.index(largestValue)
  return largestIndex

array = input("Enter a list of numbers separated by commas:")
array = [int(x) for x in array.split(",")]

largestIndex = findLargestIndex(array)
print("\nThe largest number is %d at index %d" %(array[largestIndex], largestIndex))