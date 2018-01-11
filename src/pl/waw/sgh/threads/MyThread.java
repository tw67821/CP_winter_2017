package pl.waw.sgh.threads;

public class MyThread extends Thread {

    private String name;
    private int iterator;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try{
            while (iterator <10){
                iterator++;
                System.out.println(name + " it= " + iterator);
                this.sleep(100);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+ name+ "interrupted");
        }
    }
}
