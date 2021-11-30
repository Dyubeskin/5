package web.model;

public class Car {
    private int count;
    private String model;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "count=" + count +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(int count, String model, String color) {
        this.count = count;
        this.model = model;
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
}
