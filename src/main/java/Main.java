import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config.xml");
        MyAsyncClass myAsyncClass = (MyAsyncClass) applicationContext.getBean("myAsyncClass");
            myAsyncClass.asinc1();
            myAsyncClass.asinc1();
            myAsyncClass.asinc2();
            myAsyncClass.asinc2();
            System.out.println(myAsyncClass.asink3().get());
            System.out.println(myAsyncClass.asink3().get());
            System.out.println(myAsyncClass.asink4().get());
            System.out.println(myAsyncClass.asink4().get());
    }
}
