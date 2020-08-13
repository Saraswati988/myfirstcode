
public class Day2Last {
	int x;
	Day2Last()//  constructor -. to initilize data members
	{
	x=50;
	System.out.println("test const");
	}
	void disp(){
	x=60;
	System.out.println(x);
	}
	void disp1(){
	System.out.println("THIS IS DISP1");
	System.out.println("value of x in d1 "+x);
	}
	public static void main(String[] args) {
	Day2Last d=new Day2Last(); // constructor is also used to create obj
	d.disp();
	d.disp1();

	System.out.println("-----------------------------------------");

	new Day2Last().disp(); //Day2Last() x=50 ->disp() x=60 print x(60)
	new Day2Last().disp1();//Day2Last() x=50 ->disp1() this is disp1 print x(50)

	System.out.println("---- above is same as----------------------");

	Day2Last d1=new Day2Last(); //x=50 print test const
	d1.disp(); // x=60 print x(60)
	Day2Last d2=new Day2Last(); //x=50 print test const
	d2.disp1(); // print this is disp 1 value of x(50)}

	}
}




