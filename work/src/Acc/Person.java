package Acc;

public class Person {
	Person name;
	Float age;

	public Person(Person name, Float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person getName() {
		return name;
	}

	public void setName(Person name) {
		this.name = name;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
