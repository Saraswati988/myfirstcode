
public class Day3New {
int x;
static int y;
public Day3New() {
x=50;
}



static void disp(){
System.out.println(y);
}
void disp2(){
System.out.println(x);
}
public static void main(String[] args) {
System.out.println("main");
disp();
Day3New d=new Day3New();
d.disp2();


// const gets called when obj is created
// static exists before object

}
}


/*static{
y=60;
System.out.println("static blk");
}
static{
System.out.println("static blk 2");
}
}*/