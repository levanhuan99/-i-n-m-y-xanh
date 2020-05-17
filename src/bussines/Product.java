package bussines;

public class Product {
    private String name;
    private int code;
    private int price;

    public String getName() {
        return name;
    }

    public Product(String name, int code, int price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Name:"+getName()+"|Code:"+getCode()+"|price:"+getPrice();
    }
}
