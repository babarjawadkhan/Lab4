package com.example.babarkhan.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contact_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__list);
    }

    public  class Contact_Detail {
        public
        int id;
        String Fname;
        String Lname;
        int Pnum;

        public int getPnum() {
            return Pnum;
        }

        public void setPnum(int pnum) {
            Pnum = pnum;
        }

        public String getLname() {
            return Lname;
        }

        public void setLname(String lname) {
            Lname = lname;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFname() {
            return Fname;
        }

        public void setFname(String fname) {
            Fname = fname;
        }



    }
}

