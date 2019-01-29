package com.pentalog;

import org.springframework.stereotype.Component;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;
    Format formatter = new SimpleDateFormat("yyyy.MM.dd");

    public User(){}

    public User(String fname, String lname, String date){
        this.fname = fname;
        this.lname = lname;
        setBirthDate(date);
    }

    public String getFullName(){
        return this.getFname() + " " + this.getLname();
    }

    public void setBirthDate(String birthDate) {
        try {
            this.birthDate = (Date) formatter.parseObject(birthDate);
        } catch(ParseException e) {
            System.out.println("Date string was not valid. Pattern = yyyy.MM.dd ." + e.getStackTrace());
        }
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
