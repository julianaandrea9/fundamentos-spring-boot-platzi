package fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency{

    public void saludar() {
        System.out.println("Hola mundo desde el component");
    }
}
