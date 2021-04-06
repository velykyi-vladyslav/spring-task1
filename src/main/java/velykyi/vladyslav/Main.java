package velykyi.vladyslav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import velykyi.vladyslav.config.AnimalConf;
import velykyi.vladyslav.config.ConfOne;
import velykyi.vladyslav.config.ConfTwo;
import velykyi.vladyslav.config.OtherBeansConf;
import velykyi.vladyslav.model.animals.AnimalsCollection;
import velykyi.vladyslav.model.animals.AnimalsObjects;
import velykyi.vladyslav.other.beans.OtherBeanInjector;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(
                        ConfOne.class, ConfTwo.class, OtherBeansConf.class, AnimalConf.class);

        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println(ctx.getBean(OtherBeanInjector.class));

        ctx.getBean(AnimalsCollection.class).activateVoice();
        System.out.println(ctx.getBean(AnimalsObjects.class).toString());
    }
}
