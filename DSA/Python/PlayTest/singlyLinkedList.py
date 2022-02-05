class SinglyListNode:
    def __init__(self,data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None
    
    #inserts new node at the beginning of the list
    #if head is empty, assign the node to head
    #Else, set node.next to point to head
    #Replace current head to node
    #Essentially, the latest node becomes the head.
    def insertAtHead(self, node):
        if self.head is None:
            self.head = node
        else:
            node.next = self.head
            self.head = node
    
    def deleteAtHead(self):
        del self.head

    #Start the search from the head node
    #Do a comparison check at the node with the value
    #If data is not the same as value, go to next node
    #else, return the node
    def search(self, value):
        temp = self.head
        while temp is not None:
            if temp.data is value:
                return temp.data
            else:
                temp = temp.next
        print("Error: Value not found.")

    #start at the head node
    #search for node whose node.data == value
    def delete(self, value):
        temp = self.head
        prev = None
        while temp is not None:
            if temp.data is not value:
                prev = temp
                temp = temp.next 

            else:
                if temp == self.head:
                    self.deleteAtHead()
                else:
                    prev.next = temp.next
                    del temp
                return
        print("Error: Value not found")
    
    def printList(self):
        print("Current list of content: ")
        temp = self.head
        while temp is not None:
            print('[', temp.data,']'),
            temp = temp.next
        

linkedList = SinglyLinkedList()
node = SinglyListNode(15)
linkedList.insertAtHead(node)

node = SinglyListNode(20)
linkedList.insertAtHead(node)

node = SinglyListNode(30)
linkedList.insertAtHead(node)

node = SinglyListNode(60)
linkedList.insertAtHead(node)

node = SinglyListNode(100)
linkedList.insertAtHead(node)

print(linkedList.search(15))
linkedList.delete(60)

linkedList.printList()