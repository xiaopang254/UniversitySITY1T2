#This is a 12 hour clock. This function will take in input to set the hours, minutes and second. 
#It can also display them afterwards.
class clockTime:
    
    def __init__(self):
        self.hours = 0
        self.minutes = 0
        self.seconds = 0
        self.time = 0
    
    def setHours(self,hours):
        if (int)(hours) > 0 and (int)(hours) <= 12:
            self.hours = (int)(hours)
        else:
            self.hours = (int)(0)
    
    def setMinutes(self,minutes):
        if (int)(minutes) >= 0 and (int)(minutes) < 60:
            self.minutes = (int)(minutes)
        else:
            self.minutes = (int)(0)
    
    def setSeconds(self,seconds):
        if (int)(seconds) >= 0 and (int)(seconds) < 60:
            self.seconds = (int)(seconds)
        else:
            self.seconds = (int)(0)
    
    def setTime(self):
        self.time = (str)(self.hours) + ":" + (str)(self.minutes) + ":" + (str)(self.seconds)
    
    def showTime(self):
        print(self.time)


if __name__=="__main__":
    cT = clockTime()
    
    flag = True
    while(flag):
        print("1.Set Hours\n2.Set Minutes\n3.Set Seconds\n4.Show Time\n5.Exit")
        choice = input("Your choice: ")

        if choice == "1":
            hours = input("Enter No. of hours between 1 to 12: ")
            cT.setHours((int)(hours))
        elif choice == "2":
            minutes = input("Enter No. of minutes between 0 to 59: ")
            cT.setMinutes((int)(minutes))
        elif choice == "3":
            seconds = input("Enter No. of seconds between 0 to 59: ")
            cT.setSeconds((int)(minutes))
        elif choice ==  "4":
            cT.setTime()
            print("Time: " + (str)(cT.showTime()))
        elif choice == "5":
            print("Exiting..")
            flag = False
    
