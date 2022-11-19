import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;
import jdk.jfr.Description;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone1 = new Phone("Iphone", "😎", 1, "Amazing phone", "14 PRO Max", 256);
        Phone phone2 = new Phone("Samsung", "😍", 5000, "Great phone", "S21", 128);
        Phone[] phones = {phone1, phone2};

        Laptop laptop1 = new Laptop("MacBook", "😍", 2, "Wonderful laptop", "Mac OS");
        Laptop laptop2 = new Laptop("Acer", "🤗", 500, "Productive laptop", "Windows");
        Laptop[] laptops = {laptop1, laptop2};

        Home home1 = new Home("Ihlas", "🏢", 2, "Great Home", "Multi-storey", 10);
        Home home2 = new Home("Chaos", "🏠", 50, "Amazing Home", "House", 25);
        Home[] homes = {home1, home2};

        Car car1 = new Car("Mercedes-Benz", "🚙", 2, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Car car2 = new Car("BMW", "🚘", 5000, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Car[] cars = {car1, car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire", "🛩", 1, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Airplane airplane2 = new Airplane("Airbus A320", "✈️", 500, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Airplane[] airplanes = {airplane1, airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender", "🚁", 1, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache", "🚁", 500, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Helicopter[] helicopters = {helicopter1, helicopter2};
        Announcement[] announcementOne = {car1, car2, airplane1, airplane2, helicopter1, helicopter2};
        Car[] cars1 = {car1,car2,airplane1,airplane2,helicopter1,helicopter2};
        Announcement[] announcements = {phone1, phone2, laptop1, laptop2, home1, home2, car1, car2, airplane1, airplane2, helicopter1, helicopter2};

        //System.out.println("Ведите число:");
        //  findByPrice(scanner.nextInt(), announcements);
        //Scanner scanner1 = new Scanner(System.in);
        // findByName(scanner1.nextLine(), announcements);
        //findByPricas(announcements);
        //Scanner scanner2 = new Scanner(System.in);
        //finByDescription(scanner2.nextLine(), announcements);
       // Scanner scanner3 = new Scanner(System.in);
        //finByImage(scanner3.nextLine(),announcements);
        Scanner scanner4 = new Scanner(System.in);
        finByColour(scanner4.nextLine(),cars1);

    }

    public static void findByPrice(double price, Announcement[] announcement) {
        for (Announcement announcement1 : announcement) {
            if (announcement1.getPrice() == price) System.out.println(announcement1);
        }
    }

    public static void findByName(String name, Announcement[] announcement) {
        for (Announcement announcement1 : announcement) {
            if (announcement1.getName().equals(name)) {
                System.out.println(announcement1);
            }
        }
    }

    public static void findByPricas(Announcement[] announcements) {
        double counter = 0.0;
        for (Announcement announcement : announcements) {
            counter += announcement.getPrice();
        }
        System.out.println(counter);
    }

    public static void finByDescription(String description, Announcement[] announcements) {
        for (Announcement announcement : announcements) {
            if (announcement.getDescription().equals(description)) {
                System.out.println(announcement);
            }
        }


    }

    public static void finByImage(String image,Announcement[] announcements){
        for (Announcement announcement : announcements) {
            if (announcement.getImage().equals(image)){
                System.out.println(announcement.toString());
            }
        }

    }
    public static void finByColour(String colour ,Car[] cars1){
        for (Car car : cars1) {
            if (car.getColour().equals(colour)){
                System.out.println(car);
            }
        }

    }
}
