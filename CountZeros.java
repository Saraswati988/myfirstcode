	
public class CountZeros {
	public static void main(String[] args)
	{
	int num=232009;
	int z,count=0;
	
			while(num !=0)
			{
				z=num%10;
				if(z==0)
					count++;
				num=num/10;
				
			}
	System.out.println(count+"number of zeroes" );
}
	

}
