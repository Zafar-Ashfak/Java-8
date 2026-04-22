package Project;

public class Main {
    public static void main() {
        Company company = new Company();

        Thread producer = new Thread(new Producer(company));
        Thread consumer = new Thread(new Consumer(company));

        producer.start();
        consumer.start();



    }
}
