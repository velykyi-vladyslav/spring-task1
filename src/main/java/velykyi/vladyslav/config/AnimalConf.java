package velykyi.vladyslav.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "velykyi.vladyslav.model.animals")
public class AnimalConf {
}
