package test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tcs
 */
public class DelayQueueTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition available = lock.newCondition();
        AtomicInteger count = new AtomicInteger(0);

        try {
            available.await();
            System.out.println("hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
