
class Calcs{
int x=60;
public Calcs() {
System.out.println("p const");
}
public Calcs(int  x) {
System.out.println("p const args");
}
}
class SciCalcs extends Calcs{
int x=50;
public SciCalcs() {
super(10);
}
void abc(){
System.out.println("val of x = "+super. x);
}
}
public class MainCalc {
public static void main(String[] args) {
SciCalcs sc=new SciCalcs();

//sc.abc();
}

}