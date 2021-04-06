package velykyi.vladyslav.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private String name;

    public BeanA() {
    }

    public BeanA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                '}';
    }
}
