public class Person {

    private String name;
    private Account account;
    private String address;

    // This is a constructor
    // It is called when new object is created.
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter method
    // Bank will be accessing Person object.

    // define 1 modifier, 2 return types and 3 methodName
    public String getName() {

        // this = me, myself, this object
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // public void showAccountDetails() {
    // System.out.println("Your current account number is: " +
    // this.account.accountNumber);
    // System.out.println("Is this a saving account? " + this.account.isSaving);
    // System.out.println("Is this a current account? " + this.account.isCurrent);
    // }
    public void showAccountDetails() {
        System.out.println("Your current account number is: " + this.account.getAccountNumber());
        System.out.println("Is this a saving account? " + this.account.getSaving());
        System.out.println("Is this a current account? " + this.account.getCurrent());
    }
}
