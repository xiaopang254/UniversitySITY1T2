class Stacks:
    def __init__(self):
        self.top = -1
        self.data = []
    
    def push(self,value):
        self.data.append(0)
        self.top += 1
        self.data[self.top] = value

    def pop(self):
        value = self.data[self.top]
        del self.data[self.top]
        self.top -=1
        return value

    def stackCount(self):
        return len(self.data)

    def stackPrint(self):
        print(self.data[self.top])

class Queue:
    def __init__(self):
        self.stacks1 = Stacks()
        self.stacks2 = Stacks()
    
    def enqueue(self, value):
        self.stacks1.push(value)
    
    def dequeue(self):
        if self.stacks1.stackCount() < 1 and self.stacks2.stackCount() < 1:
            return
        
        if self.stacks2.stackCount() >= 1:
            self.stacks2.pop()
        else:
            while(True):
                if self.stacks1.stackCount() == 1 and self.stacks2.stackCount() < 1:
                    self.stacks1.pop()
                    break
                elif self.stacks1.stackCount() >= 1:
                    self.stacks2.push(self.stacks1.pop())
                else:
                    self.stacks2.pop()
                    break

    def printQueue(self):
        if self.stacks1.stackCount() < 1 and self.stacks2.stackCount() < 1:
            return

        if self.stacks1.stackCount() >= 1 and self.stacks2.stackCount() >= 1:
            self.stacks2.stackPrint()

        elif self.stacks1.stackCount() < 1 and self.stacks2.stackCount() >= 1:
            self.stacks2.stackPrint()

        elif self.stacks1.stackCount() == 1 and self.stacks2.stackCount() < 1:
            self.stacks1.stackPrint()

        elif self.stacks1.stackCount() >= 1 and self.stacks2.stackCount() < 1:
            while(True):
                if self.stacks1.stackCount() >= 1:
                    self.stacks2.push(self.stacks1.pop())
                else:
                    self.stacks2.stackPrint()
                    break
            





# class Queue:
#     def __init__(self):
#         self.top = -1
#         self.top2 = -1
#         self.data = []
#         self.data2 = []

#     def enqueue(self, value):
#         self.data.append(0)
#         self.top += 1
#         self.data[self.top] = value
    
#     def dequeue(self):
#         if len(self.data) > 0:
#             if len(self.data) == 1:
#                 value = self.data[self.top]
#                 del self.data[self.top]
#                 self.top -= 1
#             else:
#                 for i in range(len(self.data)-1,-1,-1):
#                     self.top2 += 1
#                     self.data2.append(self.data[i])
#                     del self.data[i]
#                     self.top -= 1

#                 value = self.data2[self.top]
#                 del self.data2[self.top]

#                 for i in range(len(self.data2)-1,-1,-1):
#                     self.top += 1
#                     self.data.append(self.data2[i])
#                     del self.data2[i]
#                     self.top2 -= 1
#                 return value
#             return value
#         else:
#             return 0
        

#     def printQueue(self):
#         print(self.data[0])


if __name__ == '__main__':
    q = input()
    inputSize = 0

    queue = Queue()
    while(True):
        if inputSize >= int(q):
            break

        userInput = input().split()

        if (userInput[0] == "1"):
            try:
                queue.enqueue(userInput[1])
            except:
                print("Missing 2nd argument.")
        elif (userInput[0] == "2"):
            queue.dequeue()
        elif (userInput[0] == "3"):
            queue.printQueue()
        inputSize += 1