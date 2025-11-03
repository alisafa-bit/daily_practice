package June;

public class StudentRunner {
    public static void main(String[] args) {
        //Objects
        var scnObj = new Student(1,"ali", "safa", "12/12/2002");
        var scnTwoObj = new Student(2, "Faridoon", "Frotan", "11/11/1988");
        //act
        scnObj.printStudentInformation();
        scnTwoObj.printStudentInformation();
    }
}
