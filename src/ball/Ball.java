package ball;

public class Ball {

    private String color;

    private double weight;

    private double size;

    public Ball() {
    }

    public Ball(String color, double weight, double size) {
        this.color = color;
        this.weight = weight;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
