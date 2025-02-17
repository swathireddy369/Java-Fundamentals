package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student sObj = new Student();
        sObj.setAid(3);
        sObj.setAname("Swathi Reddy");
        sObj.setTech("Java");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession(); //need to open session for every task
        Transaction transaction=session.beginTransaction();
        session.save(sObj);
        transaction.commit();

    }
}