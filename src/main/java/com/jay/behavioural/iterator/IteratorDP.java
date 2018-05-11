package com.jay.behavioural.iterator;

import java.util.Iterator;


public class IteratorDP {


	public static void main(String[] args) {
		//		test1();
		//		test2();
		test3();
	}

	public static void test1() {
		Menu menu = new Menu();

		menu.addItem(new Item("Orange", 56.39));
		menu.addItem(new Item("Potato", 18));
		menu.addItem(new Item("Water melon", 60));
		menu.addItem(new Item("Musk melon", 73));

		System.out.println("Displaying Menu.....");

		Iterator<Item> it = menu.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item);
		}


		it.remove();

		System.out.println("Displaying Menu.....");

		it = menu.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item);
		}
	}

	public static void test2() {
		Menu1<Item> menu = new Menu1<>();

		menu.add(new Item("Orange", 56.39));
		menu.add(new Item("Potato", 18));
		menu.add(new Item("Water melon", 60));
		menu.add(new Item("Musk melon", 73));

		System.out.println("Displaying Menu1.....");

		Iterator<Item> it = menu.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item);
		}


		it.remove();

		System.out.println("Displaying Menu1.....");

		it = menu.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			System.out.println(item);
		}
	}

	public static void test3() {
		Menu1<Employee> menu = new Menu1<>();
		System.out.println("Displaying Employee  Menu1.....");

		menu.add(new Employee(1235,"Jayhind", 29));
		menu.add(new Employee(1254,"Mohit", 30));
		menu.add(new Employee(1239,"Ramesh", 28));

		Iterator<Employee> it = menu.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}

		it.remove();
		System.out.println("Displaying Menu1.....");
		it = menu.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}
	}
}

class Employee {
	private int empId;
	private String empName;
	private int empage;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empage=" + empage + "]";
	}
	public Employee(int empId, String empName, int empage) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empage = empage;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}


}