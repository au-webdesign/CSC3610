package Chapter21;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeWithComparator {

	public static void main(String a[]) {
		// By using name comparator (String comparison)
		TreeSet<Employee> nameComp = new TreeSet<Employee>(new MyNameComp());
		nameComp.add(new Employee("Harry", 3000));
		nameComp.add(new Employee("Ron", 6000));
		nameComp.add(new Employee("Hermione", 2000));
		nameComp.add(new Employee("Snape", 2400));
		for (Employee e : nameComp) {
			System.out.println(e);
		}
		System.out.println("===========================");
		// By using salary comparator (int comparison)
		TreeSet<Employee> salComp = new TreeSet<Employee>(new MySalaryComp());
		salComp.add(new Employee("Harry", 3000));
		salComp.add(new Employee("Snape", 6000));
		salComp.add(new Employee("Ron", 2000));
		salComp.add(new Employee("Hermione", 2400));
		for (Employee e : salComp) {
			System.out.println(e);
		}
	}
}

class MyNameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class MySalaryComp implements Comparator<Employee> {

@Override
public int compare(Employee e1, Employee e2) {
    if(e1.getSalary() > e2.getSalary()){
        return 1;
    } else {
        return -1;
    }
}
}
