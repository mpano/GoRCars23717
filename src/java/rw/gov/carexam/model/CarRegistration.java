/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.model;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import rw.gov.carexam.entity.Car;


public class CarRegistration {
   
    public void create(Car car){
    Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(car);
        ss.getTransaction().commit();
        ss.close();
    }
    
     public void update(Car p){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(p);
        ss.getTransaction().commit();
        ss.close();
    } 
     
        public void delete(String plateNo){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Car plNo = (Car)ss.get(Car.class,new Integer(plateNo));
        ss.beginTransaction();
        ss.delete(plNo);
         ss.getTransaction().commit();
        ss.close();
        
    }
     
    public Car findById(String plateNo){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Car c = (Car)ss.get(Car.class, plateNo);
        ss.close();
        return c;
    }
  
    public List<Car> findAll(){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Query qry = ss.createQuery("select c from Car c");
       
        List<Car> list = qry.list();
        ss.close();
        return list;
    }
    
    
}
