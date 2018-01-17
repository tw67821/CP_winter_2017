package pl.waw.sgh.threads;

public class OurThreads {

    private int ourIterator = 0;
    static final int NUM_THREADS = 5;

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[NUM_THREADS];

        for (int i=0;i<NUM_THREADS;i++){
            myThreads[i] = new MyThread("T_"+i);
        }

        for (int i=0;)


       /* MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");

        myThreadA.run();
        myThreadB.run();
        myThreadC.run();*/
    }
}
