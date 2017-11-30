package pl.waw.sgh.shapes;

public abstract class Shape {
    double parA;
    double parB;

    public void setParams(double parA, double parB){
        this.parA = parA;
        this.parB = parB;
    }
    public abstract double calSurface();



    @Override
    public String toString() {
        return "Shape{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shape shape = (Shape) o;

        if (Double.compare(shape.parA, parA) != 0) return false;
        return Double.compare(shape.parB, parB) == 0;
    }

}
