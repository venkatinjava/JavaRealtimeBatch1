package com.hcl.venkat.constructors;

class Employee{
	
	private int eno;
	private String ename;
	private float esalary;
	
	public Employee() {
		System.out.println("this is default constructor");
	}
	
	public Employee(int eno){
		this.eno = eno;
	}
	
	public Employee(int eno,String ename){
		this.eno = eno;
		this.ename = ename;
	}
	public Employee(int eno,String ename,float esalary){
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	String getEmpInfo()
	{
		return eno + " "+ ename + " "+ esalary;
	}
}

public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee defaultObj = new Employee();
		System.out.println(defaultObj.getEmpInfo());
		Employee employee = new Employee(5);
		System.out.println(employee.getEmpInfo());
		Employee employee2 = new Employee(10,"venkat");
		System.out.println(employee2.getEmpInfo());
		Employee employee3 = new Employee(22, "Sai", 53000);
		System.out.println(employee3.getEmpInfo());
	}

}
