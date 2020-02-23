package person;

public class Person implements Comparable<Person> {
    private String firstName;                   //First name of person
    private String lastName;                    //Last name of person
    private String emailID;                     //EmailId of person
    private StringBuffer phoneNumbers;          //phone number of person

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println(lastName);
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public StringBuffer getPhoneNumber() {
        return this.phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumber) {
        if (phoneNumbers == null) {
            this.phoneNumbers = new StringBuffer(phoneNumber);
        } else {
            this.phoneNumbers.append(", " + phoneNumber);
        }
    }

    @Override
    public String toString() {
        if (this.getEmailID() != "")
            return "-------- * -------- * -------- * --------\n" +
                    "First Name: " + this.getFirstName() + "\n" +
                    "Last Name: " + this.getLastName() + "\n" +
                    "Contact Number(s): " + getPhoneNumber() + "\n" +
                    "Email address: " + this.getEmailID() + "\n" +
                    "-------- * -------- * -------- * --------";
        else

            return "-------- * -------- * -------- * --------\n" +
                    "First Name: " + this.getFirstName() + "\n" +
                    "Last Name: " + this.getLastName() + "\n" +
                    "Contact Number(s): " + getPhoneNumber() + "\n" +
                    "-------- * -------- * -------- * --------";
    }

    @Override
    public int compareTo(Person newPerson) {
        return this.getFirstName().compareTo(newPerson.getFirstName());
    }

}
