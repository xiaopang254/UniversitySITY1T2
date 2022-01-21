class Student:
    def __init__(self,name,studentNumber):
        self.name = name
        self.studentNumber = studentNumber
        self.listScore = []
        
    def addScore(self,subjectCode, examScore):
        self.listScore.append((subjectCode, examScore))

    def getBestExamScore(self):
        best = [0,0]
        for i in self.listScore:
            if best[1] < i[1]:
                best = i
        return list(best)
      
    def getFailedModules(self):
        failedModule = []
        for i in self.listScore:
            if i[1] < 40:
                failedModule.append(i[0])
        return failedModule
      
    def printScore(self):
        subjectScores = self.name + " { "
        listScores = self.listScore
        maxList = len(listScores)
        for i in range(len(listScores)):
            subjectScores += str(listScores[i]).replace(", ", ":")
            subjectScores = subjectScores.replace("(", "")
            if len(listScores) -1 != i:
                subjectScores = subjectScores.replace(")", ", ")
            else:
                subjectScores = subjectScores.replace(")", " }")
        
        return subjectScores

name = input("Enter student name:\n")
student_number = input("Enter student number:\n")
student = Student(name,student_number)

for i in range(5):
  subject_code = input("Enter subject code:\n")
  subject_score = int(input("Enter subject score:\n"))
  student.addScore(subject_code,subject_score)

print(student.name, student.studentNumber)
print("Best score =", student.getBestExamScore())
print("Failed modules =", student.getFailedModules())
print("Subject scores: ", student.printScore())