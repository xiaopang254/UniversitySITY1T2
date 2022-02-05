class Stack:
    def __init__(self):
        self.top = -1
        #this stack is implemented with Python list (array)
        self.data = []

    def push(self, value):
        #increment the size of data using append()
        self.data.append(0)
        self.top += 1
        self.data[self.top] = value

    def pop(self):
        value = self.data[self.top]
        #delete the top value using del
        del self.data[self.top]
        self.top -= 1
        return value

    def isEmpty(self):
        return (self.top == -1)

    def printStack(self):
        print(self.data)
        
def checkBrace(s):
    # remove pass and add your code here
    # error checking
    try:
        error = 0
        stack = Stack()
        for i in s:
            if (i == "{"):
                stack.push(i)
            elif (i == "("):
                stack.push(i)
            elif (i == "["):
                stack.push(i)
            
            if (i == "}"):
                popped = stack.pop()
                if (popped != "{"):
                    error += 1
            elif (i == ")"):
                popped = stack.pop()
                if (popped != "("):
                    error += 1
            elif (i == "]"):
                popped = stack.pop()
                if (popped != "["):
                    error += 1
        if (error > 0 or stack.isEmpty() == False):
            return False
        else:
            return True
    except:
        return False

array = input("Enter a string to check:\n")

if checkBrace(array):
  print("The string",array,"is balanced")
else:
  print("The string",array,"is not balanced")