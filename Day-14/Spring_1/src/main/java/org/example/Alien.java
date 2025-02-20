package org.example;

import org.springframework.stereotype.Component;


public class Alien {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public Alien(){System.out.print("coding.....  ");
     }
      public void code(){
        System.out.println("coding.....  ");
    }
}
