#The formula is number 1 add number 2 and divides by 2
def average(num1, num2):
    return float(num1 + num2)/2.0

#Ask for user's input for the first value
x = float(input("Enter x value:"))

#Ask for user's input for the second value
y = float(input("Enter y value: "))

#Call the function average and with the values provided by the user
#Calculate and print out the average of two numbers.
print(average(x,y))
