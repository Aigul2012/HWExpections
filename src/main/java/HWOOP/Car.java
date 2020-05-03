package HWOOP;

public abstract class Car {
    protected String carModel;
    protected int price;
    protected int height;
    protected int length;
    protected int width;

    // конструктор
    public Car(String carModel, int price, int height, int length, int width) {
        this.carModel = carModel;
        this.price = price;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Cars{" +
                "carModel='" + carModel + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}