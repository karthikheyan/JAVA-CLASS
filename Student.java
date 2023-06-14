public class Student {
    int rollNumber;
    String name;
    double cgpa;
    int phoneNumber;  

    void setValues(int roll, String name, double cgpa, int phone){
        this.rollNumber = roll;
        this.name = name;
        this.cgpa = cgpa;
        this.phoneNumber = phone;
    }

    void readValues()
    {
        System.out.println(rollNumber);
    }

    void writeExam(){
        System.out.println("is Writing Exam");
    }

    public static void main(String[] args) {
        Student adi = new Student();
        adi.setValues(9, "adithiyaa", 9.0, 112345);
        adi.
    }

}
