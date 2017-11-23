package pl.waw.sgh.obj;

public class PlayWithRectangles {
    public static void main(String[] args) {
        Rectangle rl = new Rectangle();
        rl.setParams(3,5);
        double rlSurface = rl.calcSurface();
        System.out.println(rlSurface);

        Rectangle r2 = new Rectangle();
        r2.setParams(4,6);
        r2.sideA=10;
        System.out.println(r2.calcSurface() );
    }
}
