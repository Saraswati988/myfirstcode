
public class CountCaps {
	 int ctr=0;
	 int countCapss (String data) {
		 
		char[] arr=data.toCharArray();
		for(int i=0; i<data.length(); i++)
		{
			  
	   char c = data.charAt(i);
					if(c >= 'A' &&  c <='Z') 
						ctr++;
					
						
					}
		
		return ctr;
	}
	
	
public static void main(String[] args) {
		CountCaps cps=new CountCaps ();
		int dsw = cps.countCapss("sDrF");
		System.out.println(dsw);

}

}
