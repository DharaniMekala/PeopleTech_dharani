package W3ClassNotes;

public class Employee{
private int id;
String name;
int salary;
public Employee(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeKey [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
