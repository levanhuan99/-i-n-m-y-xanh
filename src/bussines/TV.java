package bussines;

public class TV extends Product{
    private int inch;

    public TV(String name, int code, int price,int inch) {
        super(name, code, price);
        this.inch=inch;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
    @Override
    public String toString(){
        return super.toString()+"|Inch:"+getInch();
    }
}
