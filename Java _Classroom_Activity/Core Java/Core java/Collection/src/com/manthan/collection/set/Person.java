package com.manthan.collection.set;

public class Person implements Comparable<Person>{
	String name;
	int id;
	double height;
	public Person(String name, int id, double height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/* @Override
	public int compareTo(Person o) {
		if(this.id>o.id) {
			return 1;
		}
		else if(this.id<o.id) {
			return -1;
		}
		else {
			return 0;
		}*/
	@Override
	public int compareTo(Person o) {
          return this.name.compareTo(o.name);
	}
	
	
	/*public int compareTo(Person o) {
		if(this.height>o.height) {
			return 1;
		}
		else if(this.height<o.height) {
			return -1;
		}
		else {
			return 0;
		}*/
	
	
	
	}
	


