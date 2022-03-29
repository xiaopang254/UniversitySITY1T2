#Expecting user's input to be the existing module code in this function.
def modules(moduleName):
    if(moduleName == "CSC1008"):
        print("Data Structures and Algorithms")
    elif(moduleName == "CSC1006"):
        print("Mathematics 2")
    elif(moduleName == "CSC1007"):
        print("Operating Systems")
    elif(moduleName == "CSC1010"):
        print("Computer Networks")
    elif(moduleName == "CSC1009"):
        print("Object-Oriented Programming")
    else:
        #If user does not input any recorgnized module code, it will output this.
        print("Invalid input.")

#Ask for user's input
moduleName = str(input("Enter module code: "))
#Use the user's input and print out the module name.
modules(moduleName)