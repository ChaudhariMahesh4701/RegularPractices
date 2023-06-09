package com.examples;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class EmployeeServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employees emp = new Employees();
		emp.setEmpName("Babu Bhaii");
		emp.setEmpSalary(100);
		s.save(emp);
		t.commit();
		System.out.println("Data inserted Sucessfully");
	}
}