import Domain_1.Bicycle;
import Domain_1.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("WELCOME TO JAVA");
        System.out.println("Phuong tien xe hoi");
        Car car = new Car();
        car.run();
        car.stop();
        car.print();
        System.out.println("Phuong tien xe dap");
        Bicycle bicycle = new Bicycle();
        bicycle.run();
        bicycle.stop();
        bicycle.print();
    }
}