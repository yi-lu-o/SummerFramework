package service;

import com.summer.BeanPostProcessor;
import com.summer.Component;

@Component
public class SummerBeanPostProcessor implements BeanPostProcessor {

    //    @Override
    public void postProcessBeforeInitialization(String beanName, Object bean) {

    }

    //    @Override
    public void postProcessAfterInitialization(String beanName, Object bean) {
        System.out.println("postProcessAfterInitialization");
    }
}
