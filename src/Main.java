import java.util.*;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        //Первое  задание:
        HashMap<Car, Info> hashMap = new HashMap<>();
        hashMap.put(new Car(1, 3455), new Info("Toyota", 1998, "price:5000$", "Red"));
        hashMap.put(new Car(2, 2378), new Info("BMW", 2000, "price:7000$", "Grey"));
        hashMap.put(new Car(3, 5432), new Info("Honda", 1995, "price:3000$", "Green"));
        hashMap.put(new Car(4, 4567), new Info("MB", 2020, "price:9000$", "Yellow"));
        hashMap.put(new Car(5, 8907), new Info("Mazda", 2019, "price:6000$", "White"));
        hashMap.put(new Car(6, 6543), new Info("Hynday", 2014, "price:10000$", "Blue"));
        hashMap.put(new Car(7, 1234), new Info("Opel", 2001, "price:4000$", "Black"));

        for (Map.Entry entry : hashMap.entrySet()) {
            Car a = (Car) entry.getKey();
            Info b = (Info) entry.getValue();

            System.out.println(a);
            System.out.println(b);


        }
    }
}



