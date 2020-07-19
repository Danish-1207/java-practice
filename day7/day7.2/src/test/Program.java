package test;
class Person
{	String name;
	int age;
	public Person() {}
	public Person(String name, int age) 
	{
		super();
		this.age = age;
		this.name=name;
	}	
	public void showrecord()
	{
		System.out.println("name	:"+name);
		System.out.println("age	:"+age);
	}
	
}
class Employee extends Person
{
	int empid;
	float salary;
	public Employee() {}
	public Employee(String name,int age,int empid,float salary)
	{
		super(name,age);
		this.empid=empid;
		this.salary=salary;
	}
	
	public void displayrecord()
	{	super.showrecord();//using super keyword  access the method of superclass
		System.out.println("empid	:"+empid);
		System.out.println("salary	:"+salary);
	}
}

public class Program
{
	public static void main(String[] args) {
		Employee emp = new Employee("abc",22,112,2500);
		Person p=emp;
		//they instant p have right to access to only name and age variable they are called as upcasting.
		p.showrecord();
		//p.displayRecord  //not ok or havnt right to acess subclass member
	}
	public static void main2(String[] args) {
		Employee emp=new Employee("abc",23,112,46000f);
		emp.displayrecord();
		emp.showrecord();
	}
	public static void main1(String[] args) {
		Employee emp=new Employee("abc",23,112,46000f);
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.empid);
		System.out.println(emp.salary);
	}
}

