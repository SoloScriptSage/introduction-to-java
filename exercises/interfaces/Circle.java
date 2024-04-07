public class Circle implements Shape {
    private double rad;
    public Circle(double rad){
        this.rad = rad;
    }
    
    @Override
    public void draw(){
        System.out.println("Circle with radius " + rad);
    }
}