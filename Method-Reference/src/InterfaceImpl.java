import java.util.Date;

public class InterfaceImpl implements MyInterface{
    @Override
    public void greet() {
        System.out.println("Hello World!!");
        System.out.println(new Date().toString());
    }
}
