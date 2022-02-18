package Ch16;

abstract class Employee
{
	private String name;
	private int age;
	
	Employee(String name, int age){
		this.name = name ; this.age = age;
	}
	
	abstract public void pay();
	abstract public void print();
	public void display() {
		System.out.print("이름 : "+name+" 나이 : " + age +" ");
	}
		
}
class Temporary extends Employee{
	
	private int ilsu;
	private int ildang;
	Temporary(String name, int age,int ilsu, int ildang) {
		super(name, age);
		this.ilsu = ilsu; this.ildang=ildang;
	}
	@Override
	public void pay() {
		System.out.print("일수 : " + ilsu + " 일당 : " + ildang + " 급여 : " + (ilsu*ildang)+"\n");
	}
	@Override
	public void print() {
		display(); //이름 나이
		pay();	//일수 일당 급여 
		
	}
	
}
class Regular extends Employee{

	protected int salary;
	Regular(String name, int age,int salary) {
		super(name, age);
		this.salary=salary;
	}
	
	@Override
	public void pay() {
		System.out.print("고정급 : " + salary +"\n");
		
	}
	@Override
	public void print() {
		display();
		pay();

	}	
}
class Manager extends Regular{

	private double incentive;
	Manager(String name, int age, int salary) {
		super(name, age, salary);
		
		if(salary>=2500000) {
			incentive=0.6;
		}else if(salary>=2000000) {
			incentive=0.5;
		}else {
			incentive=0.4;
		 }
	 
		
	}
	@Override
	public void pay() {
		System.out.print("급여 : " + (salary*(1+incentive))+"\n");
		
	}
	@Override
	public void print() {
		 display();
		 pay();
		
	}	
}
class Salesman extends Regular{
	private int sales;			//실적
	private double commission;	//수수료
	
	Salesman(String name, int age, int salary,int sales,double commission) {
		super(name, age, salary);
		this.sales= sales;
		this.commission=commission;
	} 
	@Override
	public void pay() {
		System.out.print("급여 : " + (salary + (sales*commission))+"\n");
	}
	@Override
	public void print() {
		 display();
		 pay();
	}	
}


public class C05Main {

	public static void main(String[] args) {
		Temporary obj = new Temporary("홍길동",22,30,100000);
		obj.print();
		Regular obj2 = new Regular("남길동",44,1234000);
		obj2.print();
		Manager obj3 = new Manager("동길동",55,3000000);
		obj3.print();
		Salesman obj4 =new Salesman("서길동",44,2000000,3000,0.25);
		obj4.print();
	

		

	}

}
