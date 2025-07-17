class College{

 void admitStudent(){
  int c=750;
  System.out.println(c+" students are taken admission for college"); 
   }

// local variable can not access outside the method,constructor and block
	/* void allocatedYear()
	{
                System.out.println(c+"students are joining for 1st year"); 
	}
	error: cannot find symbol*/

//2 different variables within the different scope can have same name
	void conductExam(){
	int c=250;
	System.out.println("exam was conduct only for "+c+" students");
	}

//2 local variable can not have same name with in the same scope
	/*
	void allocateHostel(){
	int a=100;
	String a="akshaya hostel"; 
	System.out.println(a+" students are allocated to "+a);
	}

	error: variable a is already defined in method allocateHostel() String a="akshaya hostel";
	*/
 
//local variable must be initialized before it use, and also it does not have default values
	/*
	void allocateHostel(){
	int room;
	System.out.println(room+" are allocated to students");
	}
	error: variable room might not have been initialized
	*/


public static void main(String[] args){
 College c=new College();
   c.admitStudent();
    c.conductExam();
    //c.allocateHostel();
}
}