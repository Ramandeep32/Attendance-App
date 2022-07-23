package com.example.new_login_signup;

public class UserHelperClass {
    String roll,email,pass,cpass;

    public UserHelperClass() {

    }

    public UserHelperClass(String roll, String email, String pass, String cpass) {
        this.roll = roll;
        this.email = email;
        this.pass = pass;
        this.cpass = cpass;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }
}

