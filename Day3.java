class Student{
String name;
int studentId;
int rollNo;
float fees;


public Student(String name, int studentId, int rollNo, float fees) {

this.name = name;
this.studentId = studentId;
this.rollNo = rollNo;
this.fees = fees;
}

void disp(){
System.out.println(name);
}
}
public class Day3 {
public static void main(String[] args) {
Student student=new Student("Raj",123,144,1500.0f);//error
student.disp();
}
}