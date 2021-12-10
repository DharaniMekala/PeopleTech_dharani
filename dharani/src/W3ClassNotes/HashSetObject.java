package W3ClassNotes;

import java.util.HashSet;
import java.util.Objects;

class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + "]";
	}

}

public class HashSetObject {
	public static void main(String[] args) {
		HashSet<Person> Viewers = new HashSet<Person>();
		Viewers.add(new Person(23, "nani"));
		Viewers.add(new Person(22, "dharani"));
		Viewers.add(new Person(20, "rani"));
		Viewers.add(new Person(24, "sonu"));
		Viewers.add(new Person(21, "jeevs"));
		Viewers.add(new Person(21, "jeevs"));
		System.out.println(Viewers);
	}
}
