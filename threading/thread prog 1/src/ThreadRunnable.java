public class ThreadRunnable implements  Runnable {


   public void run(){
       System.out.println("implementing runnable .....");
       for(int i=0; i<10; i++){
           System.out.println(i);

       }
   }

    public static void main(String[] args) {
        ThreadRunnable t = new ThreadRunnable();


        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();
        try{
            System.out.println("Main thread   " + Thread.currentThread().getName());
            t1.join();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
