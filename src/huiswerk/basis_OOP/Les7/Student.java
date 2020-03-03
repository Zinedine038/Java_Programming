package huiswerk.basis_OOP.Les7;

public class Student extends Persoon
{
    private int studentNummer;

    public Student(String naam, int lengte, int studentNummer)
    {
        super(naam, lengte);
        this.studentNummer=studentNummer;
    }

    public int getStudentNummer()
    {
        return studentNummer;
    }



    @Override
    public String toString()
    {
        return super.toString()+"Student{" +
                "studentNummer=" + studentNummer +
                '}';
    }
}
