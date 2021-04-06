package velykyi.vladyslav.other.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanInjector {

    @Autowired
    @Qualifier("otherBeanA")
    private OtherBeans otherBean;
    private OtherBeans otherBeanB;
    private OtherBeans otherBeanC;


    @Autowired
    public OtherBeanInjector(@Qualifier("otherBeanB") OtherBeans otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    @Autowired
    public void setOtherBeanC(OtherBeans otherBeanC) {
        this.otherBeanC = otherBeanC;
    }

    @Override
    public String toString() {
        return "OtherBeanInjector{" +
                "otherBean=" + otherBean +
                ", otherBeanB=" + otherBeanB +
                ", otherBeanC=" + otherBeanC +
                '}';
    }


}
