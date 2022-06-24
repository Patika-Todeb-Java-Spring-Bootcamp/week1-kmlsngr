import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String[] args) throws Exception {



        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        Thread thproducer = new Thread(producer);
        Thread thconsumer = new Thread(consumer);
        thproducer.start();
        thproducer.join();
        thconsumer.start();




    }
}