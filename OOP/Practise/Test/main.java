public class main{

    public static void main(String[] args)
    {
        System.out.println("Hello World");

        Parent parent = new Parent("Karen", 40, "Is Land", "Manager");
        ChildOne childOne = new ChildOne("Bob", 10, "Is Land", "Student");

        System.out.println(childOne.getName());

        SomeAbstractAnimal sAA = new AnimalDog();

        sAA.Scold();
        sAA.setFart("Poooooot");
        System.out.println(sAA.getFart());
        System.out.println(sAA.makeSound());

        AnimalDog dog = new AnimalDog();
        dog.talk();
        dog.walk();
        childOne.breathe();
        System.out.println(parent.getName());
    }
}