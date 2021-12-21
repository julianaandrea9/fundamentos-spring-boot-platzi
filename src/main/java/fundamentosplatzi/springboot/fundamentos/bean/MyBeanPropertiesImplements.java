package fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanPropertiesImplements implements MyBeanProperties{
    private String name;
    private String apellido;

    public MyBeanPropertiesImplements(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    @Override
    public String function() {
        return name + '-' + apellido;
    }
}
