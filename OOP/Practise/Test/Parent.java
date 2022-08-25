public class Parent {
    private String name;
    private int age;
    private String address;
    private String occupation;

    //constructor
    public Parent(String name, int age, String address, String occupation){
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getOccupation(){
        return this.occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    
}
