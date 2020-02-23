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

}
