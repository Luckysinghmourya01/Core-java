package com.rays.seializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeExternalizable implements Externalizable  {

	public String name;
	public int id;
	public String salary;
	
	public EmployeExternalizable() {
		// TODO Auto-generated constructor stub
	}

	 public EmployeExternalizable(String name , int id , String salary) {
		 
		 this.name = name;
		 this.id = id;
		 this.salary = salary;
	 }
	 
	 
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(id);
		out.writeObject(salary);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String)  in.readObject();
		id = (int) in.readObject();
		salary = (String) in.readObject();
		
	}
	
	public String toString() {
		return "name: " + name + " id: " + id + " salary: " + salary;
	}
	
	
	}

	
