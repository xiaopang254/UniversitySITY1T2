public class ChildOne extends Parent implements ISomeInterface {

    public ChildOne(String name, int age, String address, String occupation){
        super(name,age,address,occupation);
    }

    public void walk(){
        System.out.println("Child is walking.");

    }

    @Override
    public void type() {
        System.out.println("Child is typing.");
        
    }

    @Override
    public void move() {
        System.out.println("Child is moving.");
        
    }

    @Override
    public void breathe() {
        System.out.println("Child is breathing.. owait...");
        
    }
    
}
