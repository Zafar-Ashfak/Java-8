public class GenericMethods {

    // This static generic method can print any type of data
    public static <E> void printData(E data) {
        System.out.println(data);
    }

    // This generic method can print any type of data
    public <E> void display(E data) {
        System.out.println(data);
    }

    // This generic method can only print number such as Integer or Decimal
    public <T extends Number> void print(T num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        printData("I don't know why!");
        printData(620305);
        printData(7480.54);


        GenericMethods obj = new GenericMethods();
        obj.display("but I am upset");
        obj.display(2154.903);
        obj.display(24032026);


        GenericMethods obj2 = new GenericMethods();
//        obj2.print("String can be print if we don't bound it.");
        obj2.print(1241);
        obj2.print(503471.322);
    }

}

