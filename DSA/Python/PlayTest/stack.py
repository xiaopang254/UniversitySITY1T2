class Stack:
    def __init__(self):
        self.top = -1
        self.data = []
    
    #Extend the size of th stack by 1
    #increase the top of the index by 1
    #assign value to the elemnt at the top
    def push(self,value):
        #increment size of data using append
        self.data.append(0)
        self.top += 1
        self.data[self.top] = value

    #Read the value of the elemnt at the top
    #Delete the element at the top
    #Decrease the top index by 1
    #return the value
    def pop(self):
        if(len(self.data) != 0):
            value = self.data[self.top]
            #delete the top value using del
            del self.data[self.top]
            self.top -= 1
            return print(value)
        return print("Nothing")
    
    def isEmpty(self):
        if(len(self.data) == 0):
            return True
        return False
    
    def peek(self):
        if(self.isEmpty() != True):
            return print("Peeking: " + str(self.data[self.top]))
        return print(0)

stack = Stack()
stack.pop()
stack.push(100)
stack.peek()
stack.push(200)
stack.pop()
stack.pop()
stack.pop()
stack.isEmpty()
stack.peek()