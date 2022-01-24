import java.util.Currency;

public class Account {
    // protected boolean isSaving; // Saving account?
    // protected boolean isCurrent; // Current account?
    // protected String accountNumber;
    private boolean isSaving; // Saving account?
    private boolean isCurrent; // Current account?
    private String accountNumber;

    public Account(String accountNumber, Boolean isSaving, Boolean isCurrent) {
        this.accountNumber = accountNumber;
        this.isCurrent = isCurrent;
        this.isSaving = isSaving;
    }

    public boolean getSaving() {
        return isSaving;
    }

    public void setSaving(boolean saving) {
        this.isSaving = saving;
    }

    public boolean getCurrent() {
        return isCurrent;
    }

    public void setCurrent(boolean current) {
        this.isCurrent = current;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
