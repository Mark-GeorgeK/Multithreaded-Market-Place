package model;

public class item {
    private String name;
    private Integer qty;
    private String category;
    private Integer id;
    private String price;
    private Integer stockqty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQty() {
        return qty;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStockqty() {
        return stockqty;
    }

    public item(String name, String category, Integer id, String price, Integer stockqty) {
        this.name = name;
        this.category = category;
        this.id = id;
        this.price = price;
        this.stockqty = stockqty;
    }

    public void setStockqty(Integer stockqty) {
        this.stockqty = stockqty;
    }
/*
    public Product(String name, Integer qty, String category, Integer id, float price, Integer stockqty) {
        this.name = name;
        this.qty = qty;
        this.category = category;
        this.id = id;
        this.price = price;
        this.stockqty = stockqty;
    }
*/

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public item(String name, Integer qty) {
        this.name = name;
        this.qty = qty;
    }

}
