package Java_Basic;

public class StudentDetails {
    String name;
    int age;
    String gender;
    int rollNumber;



    public StudentDetails(String name, int age, String gender, int rollNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rollNumber = rollNumber;

    }

    @Override
    public String toString() {
        return "your name is " + name + " and your age is " + age + " and your gender is " + gender
                + " and your rollnumber is " + rollNumber;
    }

    public static void main(String[] args) {
        StudentDetails SD = new StudentDetails("Aichchhik", 23,"Male", 123);
        System.out.println(SD.toString());

    }
}
