 class StudentDe {
    int rollno;
    String name;
    int marks;
}
public class Student{
    public static void main(String[] args) {
        StudentDe s1=new StudentDe();
        s1.rollno=1;
        s1.name="s";
        s1.rollno=3;
        StudentDe s2=new StudentDe();
        s2.rollno=1;
        s2.name="s";
        s2.rollno=3;
        StudentDe s3=new StudentDe();
        s3.rollno=1;
        s3.name="s";
        s3.rollno=3;
        StudentDe students[]=new StudentDe[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        // System.out.println("=" + Arrays.toString(students));
        for(StudentDe stud : students){
            System.out.println("=" + stud.name + ":" + stud.marks);
         
        }

    }

}
