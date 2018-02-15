package com.varga.trading.server.database;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.varga.trading.server.database.entity.HistData;


public class UtilHistData {
	
	private SessionFactory factory;
	private int lastId;
	
	public UtilHistData() {
		// create session factory
		factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(HistData.class)
					.buildSessionFactory();			
	}
	
	public void storeData() {
		
	// create session
	Session session = factory.getCurrentSession();
	
	try {
		System.out.println("Creating object");
		Date dt = new Date();
		HistData data = new HistData("BTN-ETH", dt, 1345.45678912, 14.12345678, 
				12.12345678, 15.12345678, 50200, 55.12345678, 67.12345678, 50001, 66236);
		
		session.beginTransaction();
		
		session.save(data);
		lastId = data.getId();
		
		session.getTransaction().commit();
		System.out.println("Done");
		
	} catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
	finally {
		session.close();
	}
	}
	
	public void getLastData() {
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Geting object");

			session.beginTransaction();

			HistData data = session.get(HistData.class, lastId);
			
			System.out.println(data.toString());
			
			session.getTransaction().commit();
			System.out.println("Done");
			
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			session.close();
		}
	}		

	public void getPairData(String theTradePair) {
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Geting object");

			session.beginTransaction();

			List<HistData> pairData = session.createQuery("from HistData s where" +
						" s.tradePair='" + theTradePair + 
						"' order by dateData" + "").getResultList();
			
			displayData(pairData);
			
			session.getTransaction().commit();
			System.out.println("Done");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
		}
	}

	private void displayData(List<HistData> pairData) {
		for(HistData tmpData : pairData) {
			System.out.println(tmpData.toString());
		}
	}		


}

