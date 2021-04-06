package velykyi.vladyslav.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import velykyi.vladyslav.beans3.BeanE;


@Configuration
@ComponentScan(basePackages = {"velykyi.vladyslav.beans2", "velykyi.vladyslav.beans3"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                classes = BeanE.class))
public class ConfTwo {
}
