package WrapperClass;

public class DoubleWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double d4=99.00;
		System.out.println("i4.compareTo(99) : "+d4.compareTo(99.0));
		System.out.println("i4.compareTo(9) : "+d4.compareTo(9.0));
		System.out.println("i4.compareTo(999) : "+d4.compareTo(999.0));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		double x=d4; //Autoboxing
		System.out.println("x : "+x);
		
		x=10000;
		d4=x; //Autoboxing
		System.out.println("i4 : "+d4);
		
		String s="12443";
		
		double a=Double.parseDouble(s);  //Common across all the wrappers except Character
		System.out.println("a = "+a);
		
		a=1919191;
		s=a+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Double d5=77.00;
		Float f=d5.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("f = "+f);
		int r=f.intValue();
		System.out.println("r : "+r);

		

	}

}
