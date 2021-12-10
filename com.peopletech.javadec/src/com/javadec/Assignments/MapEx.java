package com.javadec.Assignments;

import java.util.HashMap;

class Employee {
	int eid;

	public Employee(int eid) {
		this.eid = eid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {//emp,emp1
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		return true;
	}
	
	
	
	
}

public class MapEx {
	public static void main(String[] args) {

		Employee emp = new Employee(1);// new hashcode
		Employee emp1 = new Employee(1);//emp.eid==emp1.eid
		System.out.println(emp.hashCode() + "    " + emp1.hashCode());
		HashMap<Employee, String> emps = new HashMap<Employee, String>();
		emps.put(emp, "mahesh");
		emps.put(emp1, "suresh");
		System.out.println(emps.size());// 2

		Integer id = new Integer(123);// hashcode,equals
		Integer id1 = new Integer(123);

		System.out.println(id.hashCode() + " :" + id1.hashCode());
		HashMap<Integer, String> emps1 = new HashMap<Integer, String>();
		emps1.put(id, "mahesh");
		emps1.put(id1, "suresh");
		System.out.println(emps1.size());// 1

		/*
		 * TreeMap<Integer, String> emps = new TreeMap<Integer, String>();//16
		 * emps.put(123, "suresh");// Entry emps.put(924, "mahesh"); emps.put(26,
		 * "ramya"); emps.put(256, "sandeep"); emps.put(123, "naresh");
		 * 
		 * System.out.println(emps);
		 * 
		 * // Set<Integer> keys = emps.keySet(); // // Iterator<Integer> itr =
		 * keys.iterator(); // while (itr.hasNext()) { // int key = itr.next(); //
		 * System.out.println(key + " " + emps.get(key)); // }
		 * 
		 * Set<Entry<Integer, String>> keys = emps.entrySet();
		 * 
		 * Iterator<Entry<Integer, String>> itr = keys.iterator(); while (itr.hasNext())
		 * { Entry<Integer, String> entry = itr.next();
		 * System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */

	}
}
