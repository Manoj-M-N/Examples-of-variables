
class Test{
static String greeting="hallo";
}

class Employee{
static int count=10;
static String company="IBM";

	static void details(){
	String name="ramesh";
	//static int age=21;  local variable can not be static
	System.out.println(Test.greeting+" "+name);
	System.out.println(name+" working in "+company);//access inside static method
 	}
	
	void display(){
	System.out.println(" non static method display count value:"+count);//access inside non static method
	}
	

public static void main(String[] args)
{
Employee e=new Employee();
System.out.println(count);//access inside class
System.out.println(Test.greeting);//access outside the class
details();//static method can be access without creating object
e.display();
}

}