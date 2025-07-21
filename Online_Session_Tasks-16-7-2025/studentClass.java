package OOPconcept;

public class StudentClass
{
    private String studentName;
    private int    studentAge;
    private double  studentGpa;
    private int    studentSubjectsNumber;

    public void setStudentSubjectsNumber(int studentSubjectsNumber)
    {
        this.studentSubjectsNumber = studentSubjectsNumber;
    }

    public StudentClass(String studentNameConstructor,int StudentAgeConstructor,double StudentGpaConstructor)
    {
        studentName = studentNameConstructor;
        studentAge = StudentAgeConstructor;
        studentGpa = StudentGpaConstructor;
    }


    public void displayStudentInformations()
    {
        System.out.println("Name : "+studentName);
        System.out.println("Age : "+studentAge);
        System.out.println("Gpa : "+studentGpa);
        System.out.println("Sub : "+ studentSubjectsNumber);
    }

    public String  getStudentName()
    {
        return studentName;
    }
    public int getStudentAge()
    {
        return studentAge;
    }
    public double getStudentGpa()
    {
        return studentGpa;
    }
    public int getStudentSubjectsNumber()
    {
        return studentSubjectsNumber;
    }

}
