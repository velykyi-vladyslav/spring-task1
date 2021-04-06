package velykyi.vladyslav.model.animals;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("cat")
@Order(3)
public class Cat implements Animals{
    @Override
    public void voice() {
        System.out.println("meow");
    }
}
