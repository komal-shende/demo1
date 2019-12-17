package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test 

{
	public static void main(String[] args) 
	
	{
StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(registry);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		
		Student s=new Student ();
		s.setRollnum(20);
		s.setName("komal");
		s.setAddr("pune");
		session.save(s);
		
		
		Student s1=new Student ();
		s1.setRollnum(2);
		s1.setName("ruchi");
		s1.setAddr("pune");
		session.save(s1);
		session.beginTransaction().commit();
		
		
	}
	

}
