package com.xworkz.single_sectionfactory;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SectionFactoryProvider {


	private static SessionFactory sessionFactory = null;

	static {
		sessionFactory = new Configuration().configure("hibernatemobile.cfg.xml").buildSessionFactory();
	}


	public static SessionFactory getSessionFactory() {
		System.out.println("invoked session factory");
		if(Objects.nonNull(sessionFactory))

		{
			return sessionFactory;
		}else
			System.out.println("Session fctory is not Created");
		return sessionFactory;
	}
	
		public static void closeSessionFactory()
		{
			System.out.println("invoked close  SessionFactory");
			try {
				if(sessionFactory !=null) {
					sessionFactory.close();
					System.out.println("SessionFactory is closed");
				}else {
					System.out.println("SessionFactory is not closed");
				}
			} catch (Exception e) {
				
			}
		}
/*	public static void main(String[] args) {
		
		SessionFactory factory = getSessionFactory();
		System.out.println(sessionFactory.hashCode());
	}*/
}


