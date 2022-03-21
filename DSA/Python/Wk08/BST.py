class BST:
    root = None
    
    def get(self,key):
        temp = self.root
        while temp is not None:
            if temp.key == key:
                return temp.val
            elif temp.key > key:
                temp = temp.left
            else:
                temp = temp.right
    
    def put(self,key,val):
        pass

    def put2(self,node,key,val):
        pass

    def delete(self,key):
        pass

class Node:
    left = None
    right = None
    count = 0
    key = 0
    val = 0

    def __init__(self, key, val):
        self.key = key
        self.val = val

if __name__ == "__main__":
    print("Hello")