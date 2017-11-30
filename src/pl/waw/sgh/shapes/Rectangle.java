package pl.waw.sgh.shapes;

public class Rectangle extends Shape{

    public Rectangle(){
        this.parA = 10;
        this.parB = 15;

    }


    public double calSurface (){
        return parA *parB;
    }

    public double calPerimeter(){
        return 2*parA+2*parB;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}

