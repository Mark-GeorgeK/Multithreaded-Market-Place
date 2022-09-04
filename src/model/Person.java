package model;

public class Person {    
        private String id;
        private String Fname;
        private String Lname;
        private String email;
        private String wallet;
        private String mobile;
        private String address;
        private String gender;
private String bd;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
        

    public Person(String Fname, String Lname, String email, String wallet, String mobile, String bd, String address, String gender) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.email = email;
        this.wallet = wallet;
        this.mobile = mobile;
        this.bd = bd;
        this.address = address;
        this.gender = gender;
    }


    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

   
        
    }
