package velykyi.vladyslav.model.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsObjects {
private Animals cat;
private Animals dog;
private Animals rabbitd;

@Autowired
    public AnimalsObjects(@Qualifier("cat") Animals cat, @Qualifier("dog") Animals dog, Animals rabbitd) {
        this.cat = cat;
        this.dog = dog;
        this.rabbitd = rabbitd;
    }

    @Override
    public String toString() {
        return "AnimalsObjects{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", rabbitd=" + rabbitd +
                '}';
    }
}
