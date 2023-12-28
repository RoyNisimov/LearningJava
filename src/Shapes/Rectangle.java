package Shapes;

public class Rectangle extends Parallelogram{
    public Rectangle(double width, double height){
        super(width, height);
    }

    public boolean isSquare(){
        return this.getHeight() == this.getWidth();
    }

    public String getType(){
        return "Rectangle";
    }
}
