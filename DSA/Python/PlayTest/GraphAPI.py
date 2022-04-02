class Graph:
    adjList = {}

    def __init__(self, file):
        f = open(file, 'r')
        for line in f:
            v1, v2 = line.split(" ")
            v1 = int(v1)
            v2 = int(v2)

            if v1 in self.adjList:
                self.adjList[v1].append(v2)
            else:
                self.adjList[v1] = []
                self.adjList[v1].append(v2)
            
            if v2 in self.adjList:
                self.adjList[v2].append(v1)
            else:
                self.adjList[v2] = []
                self.adjList[v2].append(v2)
    
    def addEdge(self,v,w):
        if v in self.adjList:
            self.adjList[v].append(w)
        
        else:
            self.adjList[v] = []
            self.adjList[v].append(w)
        
        if w in self.adjList:
            self.adjList[w].append(v)
        
        else:
            self.adjList[w] = []
            self.adjList[w].append(v)
    
    def adj(self,v):
        return self.adjList[v]


if __name__ == "__main__":
    g=Graph("tinyG.txt")

    for v in g.adjList.keys():
        for w in g.adjList[v]:
            print(str(v) + "-" + str(w))