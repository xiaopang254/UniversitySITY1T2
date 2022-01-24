# Enter your code here. Read input from STDIN. Print output to STDOUT
class SinglyLinkedListNode:
    def __init__(self, data):
        self.data = int(data)
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        node = SinglyLinkedListNode(data)

        if not self.head:
            self.head = node
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = node

    def search(self, value):
        temp = self.head
        while temp is not None:
            if temp.data is value:
                return temp
            temp = temp.next
        print("Search Error: Value not found")

    def insertAtHead(self, node):
        if self.head is None:
            self.head = node
        else:
            node.next = self.head
            self.head = node
    
    def printList(self):
        output = "[ "
        temp = self.head
        while temp is not None:
            output += str(temp.data) + " "
            temp = temp.next
        output += "]"
        print(output)

    def size(self):
        temp = self.head
        size = 0
        while temp is not None:
            size += 1
            temp = temp.next
        return size

LinkedList1 = SinglyLinkedList()
LinkedList2 = SinglyLinkedList()
LinkedList3 = SinglyLinkedList()

List1 = input("Enter a list of numbers in descending order for list 1 separated by commas:\n")
List2 = input("Enter a list of numbers in descending order for list 2 separated by commas:\n")

List1 = [x for x in List1.split(",")]
List2 = [x for x in List2.split(",")]

for i in range(len(List1)):
    #Node1 = SinglyListNode(List1[i])
    LinkedList1.insert(List1[i])

for x in range(len(List2)):
    #Node2 = SinglyListNode(List2[i])
    LinkedList2.insert(List2[x])

current1 = LinkedList1.head
current2 = LinkedList2.head
while(current1 != None or current2 != None):
    if (current2 != None and current1 != None):
        if(current1.data <= current2.data):
            LinkedList3.insert(current1.data)
            current1 = current1.next
        elif (current2.data < current1.data):
            LinkedList3.insert(current2.data)
            current2 = current2.next
    else:
        if(current1 != None):
            LinkedList3.insert(current1.data)
            current1 = current1.next
        if(current2 != None):
            LinkedList3.insert(current2.data)
            current2 = current2.next

print("Content of list 1")
LinkedList1.printList()
print("Content of list 2")
LinkedList2.printList()
print("Content of merged list")
LinkedList3.printList()

#3,6,6,10,45,45,50
#2,3,55,60

#-5,-3,-1,1,3,5
#-6,-4,-2,2,4,6