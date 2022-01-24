public class Bank {

    // varaibles not required at the moment
    // because bank object should be a central place to "play" around
    // Person object and Account object
    public static void main(String[] args) {
        System.out.println("Welcome to CSC1009 Bank");

        // Memorize like system.out.println and public static void main(String []
        // args){}
        Person person01 = new Person("Jun Xiang");
        // person01.setName("Jun Xiang");
        person01.setAddress("SG");

        System.out.println("Your name is " + person01.getName());
        System.out.println("Your address is " + person01.getAddress());

        person01.setName("Jun Xiang 2");
        System.out.println("Your new name is " + person01.getName());

        Person person02 = new Person("David", "AMK");
        System.out.println("Your name is " + person02.getName());
        System.out.println("Your address is " + person02.getAddress());

        Account acc01 = new Account("1234-567-8", true, false);
        person02.setAccount(acc01);
        System.out.println(("Your account number is " + acc01.getAccountNumber()));
        person02.showAccountDetails();

        VIPPerson vipPerson01 = new VIPPerson("John", "SG", "5");
        vipPerson01.getAddress();
        vipPerson01.getGrade();
        vipPerson01.getName();

        System.out.println("Your name is: " + vipPerson01.getName());
        System.out.println("Your address is: " + vipPerson01.getAddress());
        System.out.println("Your grade is: " + vipPerson01.getGrade());

        Staff staff01 = new Staff("Omega", "SG", "Numba One", "Staff001");
        System.out.println("Your name is: " + staff01.getName());
        System.out.println("Your address is: " + staff01.getAddress());
        System.out.println("Your rank is: " + staff01.getRank());
        System.out.println("Your staff number is: " + staff01.getStaffNumber());

    }
}
