package PrepUnitTesting.main.java;

import PrepUnitTesting.main.java.Exceptions.InvalidatePhoneException;

public class Contact {
    private String phoneNumber;
    private String name;

    // An Empty Constructor so you can instantiate it without any signature.
    public Contact() {
    }

    // A constructor if you just want to instantiate the object with only phone
    // number
    public Contact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // A constructor if you want to instantiate both phone number and name...
    // So you'll know whose this number belongs to.
    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {

        // Add phone number.
        // TODO: add phone number validation. Preferbly 8 digit.
        // Also Starts with either 6, 8 or 9 for Singapore Context.

        try {
            if (validatePhoneNumber(phoneNumber) == true) {
                this.phoneNumber = phoneNumber;
            }
        } catch (InvalidatePhoneException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }

    }

    // For validaiting phone number.
    private boolean validatePhoneNumber(String phoneNumber) throws InvalidatePhoneException {
        // Attempt to do validity without using REGEX.

        // Convert phoneNumber into array, so we can check for each index.
        // Can use .length to check for the length of the number, Min and Max is 8.
        char[] splitNumber = phoneNumber.toCharArray();

        if (splitNumber.length != 8) {
            // Throw exception here.
            throw new InvalidatePhoneException("InvalidPhoneException Caught: Contact number should have 8 digits!");
        }
        if ((splitNumber[0] != '9') && (splitNumber[0] != '8') && (splitNumber[0] != '6')) {
            // Throw exception here.
            throw new InvalidatePhoneException(
                    "InvalidPhoneException Caught: Contact number must start with either 6, 8 or 9.");
        }

        return true;
    }

}
