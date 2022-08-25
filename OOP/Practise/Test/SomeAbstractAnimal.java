public abstract class SomeAbstractAnimal {
    private String sound;
    private String fart;

    abstract void walk();
    abstract void talk();

    public void Scold(){
        System.out.println("Quack,Bark,Howl~!");
    }

    public String getFart(){
        return this.fart;
    }

    public void setFart(String fart){
        this.fart = fart;
    }

    public String makeSound(){
        return this.sound = "Ey mate.";
    }
    
}
