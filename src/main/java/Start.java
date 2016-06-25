import Robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dtoy on 24.06.2016.
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Object obj =  context.getBean("t1000");
        if (obj instanceof Robot.ModelT1000) {
            ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
            t1000.action();
        }


    }
}
