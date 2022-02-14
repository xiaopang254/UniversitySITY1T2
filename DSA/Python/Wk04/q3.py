#hanoi tower

#Solve the Tower of Hanoi problem recursively. 
#Here is a high-level outline of how to move a tower from the starting pole, to the goal pole, using an intermediate pole: 
#1. Move a tower of height-1 to an intermediate pole, using the final pole. 
#2. Move the remaining disk to the final pole. 
#3. Move the tower of height-1 from the intermediate pole to the final pole using the original pole.

#As long as you always obey the rule that the larger disks remain on the bottom of the stack, 
# you can use the three steps above recursively, treating any larger disks as though they were not even there. 
# Identify the base case and implement the solution.

#Example:

#Enter the number of disks: 3 ('moving disk from', 'A', 'to', 'B') 
# ('moving disk from', 'A', 'to', 'C') 
# ('moving disk from', 'B', 'to', 'C') 
# ('moving disk from', 'A', 'to', 'B') 
# ('moving disk from', 'C', 'to', 'A') 
# ('moving disk from', 'C', 'to', 'B') 
# ('moving disk from', 'A', 'to', 'B')

#moving disk from A to C 
#moving disk from A to B 
#moving disk from C to B 

def moveTower(height,fromPole, toPole, withPole):
    # add code here
    #call moveDisk in your function call.
    if(height == 0):
        return
    
    moveTower(height-1, fromPole, withPole, toPole)
    moveDisk(fromPole,toPole)
    moveTower(height-1, withPole, toPole, fromPole)

def moveDisk(fp,tp):
    print("moving disk from",fp,"to",tp)

disks = int(input("Enter the number of disks:\n"))    
moveTower(disks,"A","B","C")