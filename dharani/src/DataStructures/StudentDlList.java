package DataStructures;

public class StudentDlList {
	private Student next = null;
	static Student head;
	static int size = 0;

//adding Element to the End of the List
	public static void add(StudentDlList list, Student newStudent)

	{
		if (list.head == null)
			list.head = newStudent;
		else

		{
			Student curr = list.head;
			while (curr.next != null)
				curr = curr.next;
			curr.next = newStudent;
			newStudent.prev = curr;
		}
		size++;
	}

	public static Student get(StudentDlList list, int index) {
		Student s = null;
		if (index > size)
			System.out.println("Invalid Index..");
		else {
			int temp = 0;
			s = list.head;
			while (s.next != null) {
				s = s.next;
				temp++;
				if (temp == index)
					break;
			}

		}
		return s;
	}

	public static void printList(StudentDlList list) {
		Student curr = list.head;
		if (list.head == null)
			System.out.println("The list is empty..");
		else {
			// curr=list.head;
			while (curr != null) {
				System.out.println(curr + "-->");
				curr = curr.next;
			}
		}
		System.out.println("\nList in reverse order\n");
		Student s = get(list, size);
		while (s != null) {
			System.out.println(s + "<--->");
			s = s.prev;
		}
	}

	public static void addFirst(StudentDlList list, Student newStudent) {
		if (list.head == null)
			list.head = newStudent;
		else {
			newStudent.next = list.head;
			list.head.prev = newStudent;
			list.head = newStudent;
		}
	}

	public static void addElement(StudentDlList list, Student s, Student after) {
		if (list.head == null)
			System.out.println("list is empty");
		else {
			Student curr = list.head;
			while (curr.next != null) {
				if (curr.equals(after)) {

					after.next = curr.next;
					after.prev = curr;
					curr.next = after;

					// break;
				}
				curr = curr.next;
			}
		}
	}

	public static void remove(int position, Student s) {
		Student temp = head;
		if (position == 1) {
			head = head.next;
			temp.next = null;
		} else {
			int count = 1;
			Student previous = head;
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			Student current = previous.next;
			previous.next = current.next;
		}
	}

	public static void main(String[] args) {

		StudentDlList list = new StudentDlList();
		list.add(list, new Student(18, "dharani", "cse"));
		list.add(list, new Student(16, "jeev", "mech"));
		list.add(list, new Student(15, "sonu", "ee"));
		list.add(list, new Student(13, "nani", "ece"));
		printList(list);
		System.out.println("\nElement at index 2 : " + get(list, 2));
		System.out.println("------------------adfirst-----------------");
		list.addFirst(list, new Student(8, "kavya", "IIT"));
		printList(list);
		System.out.println("\n======================remove method=========================\n");
		list.remove(3, new Student(13, "nani", "ece"));
		printList(list);
		System.out.println("\n==================addelement=============================\n");
		list.addElement(list, new Student(16, "jeev", "mech"), new Student(32, "uth", "gre"));
		printList(list);
	}

}
