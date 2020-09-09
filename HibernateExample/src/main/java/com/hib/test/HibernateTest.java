package com.hib.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hib.entity.Company;
import com.hib.entity.Event;
import com.hib.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean flag = false;
		try {
			Event event = new Event();
			event.setDescription("Event is organized by Vikas Group");
			event.setEventDate(new Date());
			event.setPlace("Sarni");
			session.save(event);
			Company company = new Company();
			company.setCompanyName("VBSOFT");
			company.setRegistrationDate("24-08-2020");
			session.save(company);
			
			flag = true;
		}finally {
			if(transaction != null) {
				if(flag) {
					transaction.commit();
				}
			}
			if(session != null) {
				session.close();
			}
			if(factory != null) {
				HibernateUtil.closeSessionFactory();  
			}
		}
		
		
	}

}
