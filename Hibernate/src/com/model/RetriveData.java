package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class RetriveData 

{
	public static void main(String[] args) {
		
	

	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources mds=new MetadataSources(registry);
	Metadata md=mds.getMetadataBuilder().build();
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	Session session=sf.openSession();
	
	
	
	//Student st=session.load(Student.class,1);
	
	Student st=session.get(Student.class,20);
	Student st1=session.get(Student.class,2);
	
	System.out.println(st.getRollnum());
	System.out.println(st.getName());
	System.out.println(st.getAddr());
	

	System.out.println(st1.getRollnum());
	System.out.println(st1.getName());
	System.out.println(st1.getAddr());
	
	
	}
	
	
	
}
