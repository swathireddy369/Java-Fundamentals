package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;
    private String aname;

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    private String tech;
}
