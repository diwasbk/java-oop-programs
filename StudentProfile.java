class Student{
    int studentID;
    String name;
    double gpa;
    
    public void updateGPA(double gpa){
        this.gpa = gpa;
    }
    public void printProfile(){
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Name: " + this.name);
        System.out.println("GPA: " + this.gpa);
    }
}

public class StudentProfile{
    public static void main(String[] args) {
        Student st = new Student();
        st.studentID = 230185;
        st.name = "Diwas Bk";
        st.gpa = 3.9;
        st.updateGPA(3.95);
        st.printProfile();
    }
}