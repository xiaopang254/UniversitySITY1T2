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

    def peek(self):
        print(self.pop)

    def printStack(self):
        print(self.data)

    def invert(self):
        # remove pass and add your code here
        min = 0
        max = len(self.data)-1
        buffer = 0
        while (min < max):
            buffer = self.data[min]
            self.data[min] = self.data[max]
            self.data[max] = buffer
            min += 1
            max -= 1
        
array = input("Enter a list of numbers separated by commas:\n")
array = [int(x) for x in array.split(",")]
        
s = Stack()
for n in array:
  s.push(n)

s.printStack()
s.invert()
s.printStack()
s.invert()
s.printStack()