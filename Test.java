 class Customer {
	String name;
	int custtId;
	String custItem;
	float amount;
	static int salary;
static	String address;

	
public Customer(String name, int custtId, String custItem, float amount,int salary, String address) {
		this.name = name;
		this.custtId = custtId;
		this.custItem = custItem;
		this.amount = amount;
		this.salary = salary;
		this.address = address;
	}
void init()
{
	String name="ram";
	int custtId=19;
	String custItem="book";
	float amount=1729f;
	  int salary=999;
	String address="ju";
			}
void disp(){
System.out.println (name);
System.out.println (custtId);
System.out.println (custItem);
System.out.println (amount);
System.out.println (salary);
System.out.println (address);

}
}
public class Test{
public static void main(String[] args) 
	{
		Customer customer=new Customer("ram",23,"book",24.4f,233,"ju");
		customer.disp();
		customer.init();
		}
	}


