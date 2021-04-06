package velykyi.vladyslav.model.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalsCollection {

    @Autowired
    private List<Animals> animals;

    public void activateVoice(){
        for (Animals animal : animals) {
           animal.voice();
        }
    }

}
