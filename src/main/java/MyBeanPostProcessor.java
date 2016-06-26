import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by dtoy on 25.06.2016.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
    }

    @Override
    public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String name) throws BeansException {
        System.out.println(object + " - postProcessAfterInitialization");
        return object;
    }


}
