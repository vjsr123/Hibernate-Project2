package com.learn.project1.HibernateProject2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	bike bk1 = new bike();
        bike bk2 = new bike();
        bike bk3 = new bike();
 
        student1 st1 = new student1(11,"Jaga",23,bk1);
        student1 st2 = new student1(12,"Raj",26,bk2);
        student1 st3 = new student1(13,"Madhu",25,bk3);
        
        bk1.setBikeId(001);
        bk1.setBrand("Honda");
        bk1.setColour("Black");
        bk1.setStdnt(st1);
        
        bk2.setBikeId(002);
        bk2.setBrand("KTM");
        bk2.setColour("Red");
        bk2.setStdnt(st2);
        
        bk3.setBikeId(003);
        bk3.setBrand("Hero");
        bk3.setColour("Blue");
        bk3.setStdnt(st3);
        
    	Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trans = session.beginTransaction();
        session.save(st1);
        session.save(st2);
        session.save(st3);
        session.save(bk1);
        session.save(bk2);
        session.save(bk3);
        trans.commit();
        System.out.println("Student table rows inserted ");
        System.out.println("Bike table rows inserted ");
    }
}
