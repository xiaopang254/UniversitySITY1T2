def BubbleSort(list):
        for num in range(len(list)-1,0,-1):
            for i in range(num):
                if list[i] > list[i+1]:
                    temp = list[i]
                    list[i] = list[i+1]
                    list[i+1] = temp


if __name__ == "__main__":
    list1 = [5,6,8,1,2,3,9,4,0]
    print("BUBBLE SORT")
    BubbleSort(list1)
    print(list1)

