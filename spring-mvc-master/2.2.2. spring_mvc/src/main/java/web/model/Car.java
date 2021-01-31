package web.model;

public class Car {
    private String model;
    private String color;
    private int serialnumber;

    public Car(String model, String color, int serialnumber) {
        this.model = model;
        this.color = color;
        this.serialnumber = serialnumber;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialnumber=" + serialnumber +
                '}';
    }
}
