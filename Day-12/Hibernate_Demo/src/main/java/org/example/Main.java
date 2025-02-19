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
        sObj.setAid(4);
        sObj.setAname("Anand");
        sObj.setTech("google");
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession(); //need to open session for every task


//       session.persist(sObj); //save or create
//       Student s2= session.get(Student.class,4);
//       Student s2= session.load(Student.class,4); // to get data
//       Student s1=session.load(Student.class,4);
//        session.remove(s1);
        session.merge(sObj);
        Transaction transaction = session.beginTransaction(); //to do modification//
        transaction.commit();
        session.close();
        sf.close();

    }
}