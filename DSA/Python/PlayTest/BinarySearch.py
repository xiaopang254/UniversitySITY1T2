class BinarySearchST:
    keys = []
    values = []

    def put(self, key, value):
        rank = self.rank(key)
        if rank >= len(self.keys) or self.keys[rank] != key:
            self.keys.insert(rank,key)
            self.values.insert(rank,value)
        else:
            self.values[rank] = value

    def rank(self, key):
        lo = 0
        hi = len(self.keys) - 1
        while lo<= hi:
            mid = lo + (hi-lo)/2
            if key < self.keys[mid]:
                hi = mid - 1
            
            else:
                if key > self.key[mid]:
                    lo = mid + 1
                else:
                    return mid
        return lo



if __name__ == "__main__":
    print("Hello")
    bSearch = BinarySearchST()
    bSearch.put(10, 20)
    bSearch.put(11, 21)
    bSearch.put(12, 22)
    print(bSearch.rank(10))