import Book.Book;
import Car.Car;
import Dog.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> authors = new ArrayList<String>();
        authors.add("Johny");
        authors.add("Tony");

        Book book1 = new Book("Time",32,authors,"crime");
        System.out.println(book1);

        Car car1 = new Car("Lexus",322,2,true);
        System.out.println(car1);

        Dog dog1 = new Dog("Gafka",4,"doge-doge");
        System.out.println(dog1);
    }
}
