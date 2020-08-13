
public class StudentDemo {

private String name;
int rollNo;




public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public void dispStudent(){
System.out.println(name+" "+rollNo);
}

public StudentDemo(String name, int rollNo) {
this.name = name;
this.rollNo = rollNo;
}

}
