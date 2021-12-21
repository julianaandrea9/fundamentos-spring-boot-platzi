package fundamentosplatzi.springboot.fundamentos.bean;

public class MyOperationImplements implements MyOperation{

    @Override
    public int suma(int number) {
        return number+1;
    }
}
