package pl.waw.sgh.shapes;

public class triangle extends Shape {

    @Override
    public double calSurface() {
        return (parA*parB)*1/2;
    }

    @Override
    public String toString() {
        return "triangle{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
