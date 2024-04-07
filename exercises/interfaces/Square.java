public class Square implements Shape {
    private double side;
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing square with side of " + side);
    }
}