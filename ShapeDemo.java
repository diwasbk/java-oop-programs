abstract class Shape {
    public abstract void area();
    public abstract  void perimeter();
}

class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void area(){
        System.out.println("Area of a Circle: " + (Math.PI*radius*radius) );
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of Circle: " + (2*Math.PI*radius) );
    }
}

class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area(){
        System.out.println("Area of Rectangle: " + (length*breadth) );
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of Rectangle: " + (2*(length+breadth)) );
    }
}

class Square extends Shape{

    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public void area(){
        System.out.println("Area of Square: " + (side*side) );
    }

    @Override
    public void perimeter(){
        System.out.println("Perimeter of Square: " + (4*side) );
    }
}

public class ShapeDemo{
    public static void main(String[] args) {
        
        Circle c = new Circle(10);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(10, 20);
        r.area();
        r.perimeter();

        Square s = new Square(4);
        s.area();
        s.perimeter();
    }
}