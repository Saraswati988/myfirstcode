
public class TeatUpper {
 String hasUpper(String data)
{
	 char[] arr=data.toCharArray();
			for(int i=0; i<data.length(); i++)
			{
				char c = data.charAt(i);
						
				if(c >= 'A' ||  c <='Z') {
					System.out.println("true");
					
				}
					
					
					
			else {
				System.out.println("false");
				
			}
				
				
			}
			return data;
}

			

public static void main(String[] args) {
	

TeatUpper te=new TeatUpper ();
 String nkl=te.hasUpper("fdt");
 //System.out.println(nkl);

}
}

