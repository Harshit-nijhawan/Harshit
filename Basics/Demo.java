package Basics;
class student{
    int rollno;
    String name;
    int marks;

}
public class Demo {
    public static void main(String a[])
    {
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Harshit";
        s1.marks = 97;
        student s2 = new student();
        s2.rollno = 1;
        s2.name = "sahil";
        s2.marks = 96;
        student s3 = new student();
        s3.rollno = 1;
        s3.name = "navya";
        s3.marks = 95;
        
        student students[] = new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i = 0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
