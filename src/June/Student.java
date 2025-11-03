package June;

public class Student {
    // Variables
    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    //Constructor
    public Student(int id, String firstName, String lastName, String dateOfBirth){
       setId(id);
       setFirstName(firstName);
       setLastName(lastName);
       setDateOfBirth(dateOfBirth);
    }
    //Getter and Setters
    private int getId(){return id;}
    private String getFirstName(){return firstName;}
    private String getLastName() {return lastName;}
    private String getDateOfBirth() {return dateOfBirth;}

    //Setter is always void get the values and set to variables
    private void setId(int id){this.id = id;}
    private void setFirstName(String firstName){this.firstName=firstName;}
    private void setLastName(String lastName) {this.lastName = lastName;}
    private void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    // Methods
    public void printStudentInformation() {
        System.out.println("  * * * * * * Student Information  * * * * * * ");
        System.out.println("Id: " + getId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Date of Birth: " + getDateOfBirth());
    }
}
