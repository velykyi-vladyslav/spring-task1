package velykyi.vladyslav.model.animals;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("dog")
@Order(2)
public class Dog implements Animals {
    @Override
    public void voice() {
        System.out.println("gav");
    }
}
