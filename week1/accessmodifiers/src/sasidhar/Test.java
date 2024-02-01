package sasidhar;

public class Test {

	int i; 
	Test(int i){ 
	this.i=i; 
	} 
	public int hashCode(){ 
	return i; 
	} 
	public static void main(String[] args){ 
	Integer a=4;
	Integer b=4;
	System.out.println(a.equals(b));
}
}