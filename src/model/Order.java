/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class Order  {

    private Integer id;
    private float total;
    private String date;
    private ArrayList<item> products;
   
    private String qty;
    private String name;
    private String Fname;
    private String Lname;

    private String address;
    //private String [] names;
    //private Integer [] qtys;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order(int id, float total, String date, ArrayList<item> products) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.products = products;
    }
/*
    public Order(Integer id, float total, String date, Product[] products, String qty, String name, String Fname, String Lname) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.products = products;
        this.qty = qty;
        this.name = name;
        this.Fname = Fname;
        this.Lname = Lname;
    
    }
    */

    public Order(Integer id, float total, String date, ArrayList<item> products, String Fname, String Lname,String address) {
        this.id = id;
        this.total = total;
        this.date = date;
        this.products = products;
        this.Fname = Fname;
        this.Lname = Lname;
        this.address= address;
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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<item> getProducts() {
        return products;
    }

   public void setProducts(ArrayList<item> products) {
     this.products = products;
   }

  

    public void setQty() {
               this.qty="";
       for (item product : products){
           this.qty= this.qty  + Integer.toString(product.getQty()) +"\n";
    }
    }
    
        public String getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setName() {
        this.name="";
       for (item product : products){
           this.name= this.name + product.getName() +"\n " ;
       }
   }

    
    }
