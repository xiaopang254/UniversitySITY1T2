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
        return self.searchNode(self.root, key)
    
    def size2(self, n):
        if n is None:
            return 0
        else:
            return 1 + self.size2(n.left) + self.size2(n.right)

    def searchNode(self, node, key):
        if node is None:
            return None
        else:
            if key == node.key:
                return self.size2(node)
            elif key < node.key:
                return self.searchNode(node.left,key)
            else:
                return self.searchNode(node.right, key)

    def createTree(self, a): 
        
        for x in a:
            n = x.split(":")
            self.put(n[0], n[1])
        pass
    
    #Create a AVL Tree, you are allowed to create other helper functions
    def createBalancedTree(self, a):
        self.root = None
        for x in a:
            n = x.split(":")
            self.put(n[0], n[1])

    def rotateRight(self, node):
        leftChild = node.left
        leftChildRight = leftChild.right
        leftChild.right = node
        node.left = leftChildRight
        return leftChild

    def rotateLeft(self, node):
        rightChild = node.right
        rightChildLeft = rightChild.left
        rightChild.left = node
        node.right = rightChildLeft
        return rightChild

    def avlPut(self, key, val):
        self.root = self.put2(self.root, key, val)
    
    def avlPut2(self, node, key, val):
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

        bal = self.checkBalance(node)

        if bal < -1:
            if key < node.right.key:
                node.right = self.rotateRight(node.right)
            return self.rotateLeft(node)

        if bal > 1:
            if key > node.left.key:
                node.left = self.rotateLeft(node.left)
            return self.rotateRight(node)

        return node

    def checkBalance(self, node):
        balance = 0
        if node is not None:
            return self.checkBalance(node.left) - self.checkBalance(node.right)
        return balance
            
    #preOrder Traversal, this should be a recursive function
    def preOrder(self, node):
        #C L R
        preOrderArray = []
        if node is None:
            return None
        if (node != None):
            preOrderArray.append("%s:%s" % (str(node.key),node.val))
            if node.left != None:
                preOrderArray += self.preOrder(node.left)
            if node.right != None:
                preOrderArray += self.preOrder(node.right)
        return preOrderArray
        
    #inOrder Traversal, this should be a recursive function
    def inOrder(self, node):
        #L C R
        inOrderArray = []
        if node is None:
            return None
        if (node != None):
            if node.left != None:
                inOrderArray += self.inOrder(node.left)
            inOrderArray.append("%s:%s" % (str(node.key), node.val))
            if node.right != None:
                inOrderArray += self.inOrder(node.right)
        return inOrderArray
             
    #postOrder Traversal, this should be a recursive function
    def postOrder(self, node):
        # L R C
        postOrderArray = []
        if node is None:
            return None
        if (node != None):
            if node.left != None:
                postOrderArray += self.postOrder(node.left)
            if node.right != None:
                postOrderArray += self.postOrder(node.right)
            postOrderArray.append("%s:%s" % (str(node.key), node.val))
        return postOrderArray
      
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
        return count + 1
    
    def depth2(self,node, key):
        if node is None:
            return float('-inf')
        if node.key == key:
            return -1
        elif key < node.key:
            return 1 + self.depth2(node.left, key)
        elif key > node.key:
            return 1 + self.depth2(node.right, key)

    def search(self,key):
        temp = self.root
        if temp is None:
            return self.root
        
    
    #given a key, find the node and obtain the height, you are allowed to create other helper functions
    def height(self, key):
        left = self.height2(self.root.left, key)
        right = self.height2(self.root.right, key)
        return max(left,right)

    def height2(self, node, key):
        if node is None:
            return 0
        
        if node.key == key:
            return 0
        
        left = 1 + self.height2(node.left, key)
        right = 1 + self.height2(node.right, key)

        return max(left, right)


    #given a key, delete the node, you are allowed to create other helper functions
    def delete(self, key):
        self.root = self.delete2(self.root, key)
        if self.root is None:
            return False
        return True

    def delete2(self, node, key):
        if node is None:
            return None
        if node.key > key:
            node.left = self.delete2(node.left,key)
        elif node.key < key:
            node.right = self.delete2(node.right,key)
        else:
            if node.left is None and node.right is None:
                node = None
                return node
            if node.left is None and node.right is not None:
                return node.right
            elif node.right is None and node.left is not None:
                return node.left
            else:
                n = self.minimumValue(node.right)
                node.right = self.deleteMinimum2(node.right)
                node.key = n.key
                node.val = n.val

        return node
    
    def minimumValue(self, node):
        currentNode = node
        while currentNode.left != None:
            currentNode = currentNode.left
        return currentNode
    
    def deleteMinimum(self):
        self.root = self.deleteMinimum2(self.root)
    
    def deleteMinimum2(self, node):
        if node.left != None:
            node.left = self.deleteMinimum2(node.left)
            return node
        node = None
        return node
        
      	
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