package velykyi.vladyslav.model.animals;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Primary
public class Rabbit implements Animals {

    @Override
    public void voice() {
        System.out.println("...");
    }
}
