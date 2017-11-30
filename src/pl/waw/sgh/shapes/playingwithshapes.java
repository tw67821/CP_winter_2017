package pl.waw.sgh.shapes;

public abstract class playingwithshapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4,6);
        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);
        if (r1.equals(r2))
            System.out.println("r1 equals r2");

        Circle c1 = new Circle();

        System.out.println(r1);
        System.out.println(c1);
        c1.setParams(5,0);
        System.out.println(c1.calSurface());
        Shape[] shapes = new Shape[5];
        shapes[0] = r1;
        shapes[1]=c1;
        shapes[2] = new Circle();
        shapes[2].setParams(2,0);
        shapes[3] = new NewRectangle();
        shapes[4] = new triangle();
        shapes[4].setParams(10,5);
        for(Shape s: shapes){
            System.out.println("Shape: "+s);
            System.out.println("Surface: " + s.calSurface());
            if(s instanceof Rectangle){
                System.out.println("Perimiter "+ ((Rectangle)s).calPerimeter());
            }
        }

        /*Shape s1 = new Shape();
        System.out.println(s1);*/
    }
}
