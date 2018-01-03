import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

import java.util.Date;
import java.util.concurrent.Future;

public class MyAsyncClass {
    private Date date = new Date();

    @Async
    public void asinc1() throws InterruptedException {
        Thread.sleep(1000);
        Date date2 = new Date();
        Long date3 = (date2.getTime() - date.getTime())/1000;
        System.out.println("метод 1 " + Thread.currentThread().getName() + " " + date3 + "c");
    }

    @Async
    public void asinc2() throws InterruptedException {
        Thread.sleep(1000);
        Date date2 = new Date();
        Long date3 = (date2.getTime() - date.getTime())/1000;
        System.out.println("метод 2 " + Thread.currentThread().getName() + " " + date3 + "c");
    }

    @Async
    public Future<String> asink3() throws InterruptedException {
        Thread.sleep(1000);
        Date date2 = new Date();
        Long date3 = (date2.getTime() - date.getTime())/1000;
        return new AsyncResult<>("метод 3 " + Thread.currentThread().getName() + " " + date3 + "c");
    }

    @Async
    public Future<String> asink4() throws InterruptedException {
        Thread.sleep(1000);
        Date date2 = new Date();
        Long date3 = (date2.getTime() - date.getTime())/1000;
        return new AsyncResult<>("метод 4 " + Thread.currentThread().getName() + " " + date3 + "c");
    }
}
