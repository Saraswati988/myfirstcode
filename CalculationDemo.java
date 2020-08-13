
public class CalculationDemo {
	 int var=0;
	 int max=0;
	 //int temp, size;
	// size = x.length;
	 
	int sum(int... x){
	//System.out.println("sum meth "+ x.length);
    for (int i = 0; i < x.length; i++) 
    	 var = var + x[i]; 
    System.out.println("the total value     " + var);
  int avg=var/2;
    System.out.println("the average value is   "  + avg);
   
    	
	
    return var;
}
 public static void main(String[] args) {
	CalculationDemo c=new CalculationDemo();
	c.sum(10,89,90,9,8,7,32,12,389,2,32,12,12,4);
	
	}

}
