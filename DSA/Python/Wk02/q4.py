# Enter your code here. Read input from STDIN. Print output to STDOUT
class SinglyListNode:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

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

    # def delete(self,value):
    #     prev = None
    #     temp = self.head
    #     while temp is not None:
    #         #if value not found
    #         if temp.data is not value:
    #             prev = temp
    #             temp = temp.next
    #         #if value is found
    #         else:
    #             #node to be deleted is head
    #             if temp == self.head:
    #                 self.deleteAtHead()
    #             else:
    #                 prev.next = temp.next
    #                 del temp
    #             return
    #     print("Value ", value, " cannot be found")

    # def deleteAtHead(self):
    
    def printList(self):
        print("Current list content: ")
        temp = self.head
        while temp is not None:
            print("[", temp.data,"]")
            temp = temp.next
        print

    def size(self):
        temp = self.head
        size = 0
        while temp is not None:
            size += 1
            temp = temp.next
        return size

LinkedList1 = SinglyLinkedList()
LinkedList2 = SinglyLinkedList()

List1 = input("Enter a list of numbers in descending order for list 1 separated by commas:")
List2 = input("Enter a list of numbers in descending order for list 2 separated by commas:")

List1 = [x for x in List1.split(",")]
List2 = [x for x in List2.split(",")]

for i in range(len(List1)):
    Node1 = SinglyListNode(List1[i])
    LinkedList1.insertAtHead(Node1)

for i in range(len(List2)):
    Node2 = SinglyListNode(List2[i])
    LinkedList2.insertAtHead(Node2)

current = LinkedList1.head
value = 0
while(current != None):
    value = current.data
    current = current.next
    print(value)

# current = LinkedList1.head
# now = current.next
# print("Testing")