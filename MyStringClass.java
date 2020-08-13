class Testing{
	String data;
	int index;
	int subele;
	


String  Testing(String data, int index, int subele) {
	int i;
	String b="";
	char[] arr = data.toCharArray();
	//hello
for(i=0; i<data.length(); i++) {
	if(i>=index && i<=(index+subele-1)) {
		continue;
	}
	else
		b=b+arr[i];
	
}
String newstr=new String(b);
return newstr;
	}
}

//public void


public class MyStringClass{
public static void main(String[] args) {
Testing her = new Testing();
String val = her.Testing("hello world",1,4);
System.out.println(val);



	

}
}

