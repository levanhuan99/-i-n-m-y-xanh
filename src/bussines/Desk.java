package bussines;

public class Desk extends Product {
    private String color;
    public Desk(String name, int code, int price,String color) {
        super(name, code, price);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return super.toString()+"|Color:"+getColor();
    }
}
