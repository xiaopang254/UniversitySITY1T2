#A Calculator class to do calculations!
#This calculator can do Adding, Subtracting, Multiplying and Dividing!

class Calculator:
    def __init__(self):
        self.results = 0.0

    #Adding function
    def adder(self, value1, value2):
        self.results += (float)(value1) + (float)(value2)
    
    def subtractor(self, value1, value2):
        self.results -= (float)(value1) - (float)(value2)
    
    def multiplyer(self, value1, value2):
        self.results *= (float)(value1) * (float)(value2)
    
    def divider(self, value1, value2):
        self.results /= (float)(value1) / (float)(value2)
    
    def clear(self):
        self.results = 0.0


if __name__ == "__main__":
    calculator = Calculator()
    flag = True
    while(flag == True):
        print("1.Adder\n2.Subtractor\n3.Multiplyer\n4.Divider\n5.Show Results\n6.Clear Results\n0.Exit")
        choice = input("Your choice: ")
        if (choice == "1"):
            value1 = input("Enter first value to add:")
            value2 = input("Enter second value to add:")
            print("Adding..")
            calculator.adder(value1,value2)
        elif (choice == "2"):
            value1 = input("Enter first value to add:")
            value2 = input("Enter second value to add:")
            print("Subtracting..")
            calculator.subtractor(value1,value2)
        elif (choice == "3"):
            value1 = input("Enter first value to add:")
            value2 = input("Enter second value to add:")
            print("Multiplying..")
            calculator.multiplyer(value1,value2)
        elif (choice == "4"):
            value1 = input("Enter first value to add:")
            value2 = input("Enter second value to add:")
            print("Multiplying..")
            calculator.multiplyer(value1,value2)
        elif (choice == "5"):
            print("\nYour results: " + (str)(calculator.results) + "\n")
        elif(choice == "6"):
            calculator.clear()
            print("Results is cleared! Current result: " + (str)(calculator.results))
        elif(choice == "0"):
            print("Exiting..")
            flag = False
