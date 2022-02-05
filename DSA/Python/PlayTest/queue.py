class Queue:
    def __init__(self):
        self.data = []
        self.rear = -1

    #adds value to the rear of the queue
    #extend the size of the queue by 1
    #increase the rear index by 1
    #assign value to the element at the rear index
    def enqueue(self,value):
        self.data.append(0)
        self.rear += 1
        self.data[self.rear] = value

    #Remove and return the value of the item from the front of the queue
    #delete the element at index 0
    #read the value at index 0 (front)
    def dequeue(self):
        if(len(self.data) != 0):
            value = self.data[0]
            del self.data[0]
            self.rear -= 1
            return value
        return 0
queue = Queue()

queue.enqueue(100)
print(queue.dequeue())
print(queue.dequeue())
