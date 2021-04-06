package velykyi.vladyslav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import velykyi.vladyslav.other.beans.OtherBeanC;


@Configuration
@ComponentScan(basePackages = {"velykyi.vladyslav.other.beans"})
public class OtherBeansConf {
}
