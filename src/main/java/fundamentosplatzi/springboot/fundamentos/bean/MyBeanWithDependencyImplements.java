package fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplements implements MyBeanWithDependency{
    private MyOperation myOperation;

    public MyBeanWithDependencyImplements(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int number = 10;
        System.out.println(myOperation.suma(number));
        System.out.println("hola desde la implementación de un bean con dependencia");
    }
}
