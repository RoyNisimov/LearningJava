package Shapes;

public class Parallelogram {
    private double width;
    private double height;
    public Parallelogram(double width, double height){
        this.width = width;
        this.height = height;
    }

    public String getType(){
        return "Parallelogram";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
