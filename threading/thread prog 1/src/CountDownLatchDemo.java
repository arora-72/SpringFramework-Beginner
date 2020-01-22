import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        Sample first = new Sample(1, latch, "first");
        Sample second = new Sample(1, latch, "second");
        Sample third = new Sample(1, latch, "third");
        Sample fourth = new Sample(1, latch, "fourth");
        Sample five = new Sample(1, latch, "five");

        first.start();
        second.start();
        third.start();
        fourth.start();
        five.start();


        latch.await();
        System.out.println("finished");

        AtomicInteger
    }
}


class Sample  extends  Thread{
    private int num;
    private CountDownLatch latch;
    private String name;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Sample(int num, CountDownLatch latch, String name){
        this.num = num;
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        try{
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + "finished");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}