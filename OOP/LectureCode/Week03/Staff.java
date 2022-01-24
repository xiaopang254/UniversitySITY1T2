public class Staff extends Person {

    private String rank;
    private String staffNumber;

    public Staff(String name, String address, String rank, String staffNumber) {
        super(name, address);
        this.rank = rank;
        this.staffNumber = staffNumber;
    }

    public String getRank() {
        return this.rank;

    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getStaffNumber() {
        return this.staffNumber;

    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

}
