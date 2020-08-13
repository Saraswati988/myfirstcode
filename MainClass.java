




class Calc{  //parrent class
public void sum(){
System.out.println("sum method");
}
public void mul(){
System.out.println("mul method");
}
}

class SciCalc extends Calc{ //child class

}

public class MainClass {   //main class

public static void main(String[] args) {
SciCalc sc=new SciCalc();
sc.sum();
sc.mul();
}
}



