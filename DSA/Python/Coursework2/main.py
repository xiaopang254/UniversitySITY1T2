import os
import sys

class BST:
    root=None

    def put(self, key, val):
        self.root = self.put2(self.root, key, val)

    def put2(self, node, key, val):
        if node is None:
            #key is not in tree, create node and return node to parent
            return Node(key, val)
        if key < node.key:
            # key is in left subtree
            node.left = self.put2(node.left, key, val)
        elif key > node.key:
            # key is in right subtree
            node.right = self.put2(node.right, key, val)
        else:
            node.val = val
        return node

    #given a key, find the node and obtain the size, you are allowed to create other helper functions
    def size(self, key):

        pass

    def size2(self, n):
        if n is None:
            return 0
        else:
            return 1 + size2(n)

    def createTree(self, a): 
        
        for x in a:
            n = x.split(":")
            self.put(n[0], n[1])
    
    #Create a AVL Tree, you are allowed to create other helper functions
    def createBalancedTree(self, a):
        pass
            
    #preOrder Traversal, this should be a recursive function
    def preOrder(self, node):
        #C L R
        if (node != None):
            print(node.val)
            self.preOrder(node.left)
            self.preOrder(node.right)
        
    #inOrder Traversal, this should be a recursive function
    def inOrder(self, node):
        #L C R
        if (node != None):
            self.inOrder(node.left)
            print(node.val)
            self.inOrder(node.right)
             
    #postOrder Traversal, this should be a recursive function
    def postOrder(self, node):
        # L R C
        if (node != None):
            self.postOrder(node.left)
            self.postOrder(node.right)
            print(node.val)
      
    #given a key, obtain its value
    def get(self, key):
        temp = self.root
        while temp is not None:
            if temp.key == key:
                return temp.val
            elif temp.key > key:
                temp = temp.left
            elif temp.key < key:
                temp = temp.right
        return None

         
    #given a key, find the node and obtain the depth, you are allowed to create other helper functions
    def depth(self, key):
        count = self.depth2(self.root, key)
        if count < 0:
            return None
        return count
    
    def depth2(self,node, key):
        if node is None:
            return float('-inf')
        if node.key == key:
            return -1
        elif key < node.key:
            return 1+ self.depth2(node.left, key)
        elif key > node.key:
            return 1+ self.depth2(node.right, key)

    
    #given a key, find the node and obtain the height, you are allowed to create other helper functions
    def height(self, key):

        pass 

    #given a key, delete the node, you are allowed to create other helper functions
    def delete(self, key):
        pass
      	
class Node:
    left = None
    right = None
    key = 0
    val = 0

    def __init__(self, key, val):
        self.key = key
        self.val = val

array = input("Enter a list of key:value pairs separated by commas:\n")
array = [str(x) for x in array.split(",")]

bst = BST()
bst.createTree(array)

###testcase 0 (get())
for i in range(2):
    key1 = input("Input key for get() method:\n")
    if key1 != '-':
        print("The value of", key1, "is", bst.get(key1))

###testcase 1 (size(),depth(),height())
key1 = input("Input key for size() method:\n")
if key1 != '-':
    print("The size of", key1, "is", bst.size(key1))

key1 = input("Input key for depth() method:\n")
if key1 != '-':
    print("The depth of", key1, "is", bst.depth(key1))
    
key1 = input("Input key for height() method:\n")
if key1 != '-':
    print("The height of", key1, "is", bst.height(key1))
    
print()

###testcase 2 (preOrder(), inOrder(), postOrder())
print("The preOrder traversal is", bst.preOrder(bst.root))
print("The inOrder traversal is", bst.inOrder(bst.root))
print("The postOrder traversal is", bst.postOrder(bst.root))
print()

###testcase 3 delete()
for i in range(2):
    key1 = input("Input key for delete() method:\n")
    if key1 != '-':
        print("Deleting", key1, "is", bst.delete(key1))
        print("The preOrder traversal is", bst.preOrder(bst.root))
        print("The inOrder traversal is", bst.inOrder(bst.root))
        print("The postOrder traversal is", bst.postOrder(bst.root))

###testcase 4 createbalancedTree()
key1 = input("Test balanced Tree? \n")
if key1 == 'Y':
    bst.createBalancedTree(array)
    print("The preOrder traversal is", bst.preOrder(bst.root))
    print("The inOrder traversal is", bst.inOrder(bst.root))
    print("The postOrder traversal is", bst.postOrder(bst.root))