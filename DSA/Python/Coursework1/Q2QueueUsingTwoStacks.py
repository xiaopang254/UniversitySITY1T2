class Stacks:
    def __init__(self):
        self.top = -1
        self.top2 = -1
        self.data = []
        self.data2 = []

    def enqueue(self, value):
        self.data.append(0)
        self.top += 1
        self.data[self.top] = value
    
    def dequeue(self):
        if len(self.data) > 0:
            if len(self.data) == 1:
                value = self.data[self.top]
                del self.data[self.top]
                self.top -= 1
            else:
                for i in range(len(self.data)-1,-1,-1):
                    self.top2 += 1
                    self.data2.append(self.data[i])
                    del self.data[i]
                    self.top -= 1

                value = self.data2[self.top]
                del self.data2[self.top]

                for i in range(len(self.data2)-1,-1,-1):
                    self.top += 1
                    self.data.append(self.data2[i])
                    del self.data2[i]
                    self.top2 -= 1
                return value
            return value
        else:
            return 0
        

    def printQueue(self):
        print(self.data[0])


if __name__ == '__main__':
    q = input()
    inputSize = 0

    stacks = Stacks()
    while(True):
        if inputSize >= int(q):
            break


        userInput = input().split()

        if (userInput[0] == "1"):
            try:
                stacks.enqueue(userInput[1])
            except:
                print("Missing 2nd argument.")
        elif (userInput[0] == "2"):
            stacks.dequeue()
        elif (userInput[0] == "3"):
            stacks.printQueue()
        inputSize += 1