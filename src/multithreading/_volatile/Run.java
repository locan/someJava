package multithreading._volatile;

/**
 * Created by locan on 17/9/7.
 */
public class Run {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}


class MyThread extends Thread {
    volatile public static int count;

    /**
     * 注意这里一定要加static ，这样synchronized 修饰的是MyThread.class类，才可以达到同步的效果
     */
    synchronized private static void addCount() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
        System.out.println("count:" + count);
    }

    /*
    //这里没有把该方法锁住，volatile不具备原子性
    private static void addCount() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
        System.out.println("count:" + count);
    }
     */

    @Override
    public void run() {
        addCount();
    }
}