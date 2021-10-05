package DataStructures;

import java.util.Objects;

public class  Student{
private int rollno;
private String name;
private String stream;
Student next;
Student prev;

public Student(int rollno, String name, String stream) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.stream = stream;

	this.next=null;
	this.prev=null;
}
public Student(Student index)
{
	
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public Student getNext() {
	return next;
}
public void setNext(Student next) {
	this.next = next;
}
public Student getPrev() {
	return prev;
}
public void setPrev(Student prev) {
	this.prev = prev;
}
@Override
public int hashCode() {
	final int prime=31;
	int result=prime+rollno+name.hashCode()+stream.hashCode();
	return result;
}
@Override
public boolean equals(Object obj) {
	Student s=(Student)obj;
	if (s.rollno==this.rollno && s.name.equals(this.name) && s.stream.equals(this.stream))
		return true;
	else
		return false;
	
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]";
}
}