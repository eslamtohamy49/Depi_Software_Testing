
import OOPconcept.StudentClass;

public class Main
{
    public static void main(String[] args)
    {
        StudentClass studentNumber_1 = new StudentClass("Mohamed Ali",20,3.54);
        studentNumber_1.setStudentSubjectsNumber(5);
        studentNumber_1.displayStudentInformations();
        System.out.println("Student Name Getter : "+studentNumber_1.getStudentName());
        System.out.println("Student Age  Getter : "+studentNumber_1.getStudentAge());
        System.out.println("Student Gpa  Getter : "+studentNumber_1.getStudentGpa());
        System.out.println("Student Subjects Getter : "+studentNumber_1.getStudentSubjectsNumber());

        System.out.println("---------------------------------------------------------------------------------------------");

        StudentClass studentNumber_2 = new StudentClass("Fatma Hassan", 19, 3.8f);
        studentNumber_2.setStudentSubjectsNumber(6);
        studentNumber_2.displayStudentInformations();
        System.out.println("Student Name Getter : " + studentNumber_2.getStudentName());
        System.out.println("Student Age  Getter : " + studentNumber_2.getStudentAge());
        System.out.println("Student Gpa  Getter : " + studentNumber_2.getStudentGpa());
        System.out.println("Student Subjects Getter : " + studentNumber_2.getStudentSubjectsNumber());

        System.out.println("---------------------------------------------------------------------------------------------");

        StudentClass studentNumber_3 = new StudentClass("Omar Youssef", 21, 3.2f);
        studentNumber_3.setStudentSubjectsNumber(4);
        studentNumber_3.displayStudentInformations();
        System.out.println("Student Name Getter : " + studentNumber_3.getStudentName());
        System.out.println("Student Age  Getter : " + studentNumber_3.getStudentAge());
        System.out.println("Student Gpa  Getter : " + studentNumber_3.getStudentGpa());
        System.out.println("Student Subjects Getter : " + studentNumber_3.getStudentSubjectsNumber());

        System.out.println("---------------------------------------------------------------------------------------------");

        StudentClass studentNumber_4 = new StudentClass("Sara Nabil", 22, 3.95f);
        studentNumber_4.setStudentSubjectsNumber(5);
        studentNumber_4.displayStudentInformations();
        System.out.println("Student Name Getter : " + studentNumber_4.getStudentName());
        System.out.println("Student Age  Getter : " + studentNumber_4.getStudentAge());
        System.out.println("Student Gpa  Getter : " + studentNumber_4.getStudentGpa());
        System.out.println("Student Subjects Getter : " + studentNumber_4.getStudentSubjectsNumber());


    }
}

