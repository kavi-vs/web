package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import tech.kavi.vs.core.LauncherVerticle;
import tech.kavi.vs.web.HandlerRequestAnnotationBeanName;

@Import(BeanConfiguration.class)
@ComponentScan(nameGenerator= HandlerRequestAnnotationBeanName.class)
public class ApplicationVerticle extends LauncherVerticle {

    @Override
    public void start() throws Exception {
        super.start();
        System.out.println("Deploy ApplicationVerticle");
    }
    public static void main(String[] args) {
        launcher(ApplicationVerticle.class);
    }
}
