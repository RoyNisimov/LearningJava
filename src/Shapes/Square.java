package Shapes;

public class Square extends Rectangle{
    public Square(double length){
        super(length, length);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(this.getHeight(), 2) * 2);
    }
    public String getType(){
        return "Square";
    }
}
