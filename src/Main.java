import transport.Car;

public class Main {
    int month = 12;
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "Механика", "Седан", 123, 0, true, new Car.Key(false, false));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "Автомат", "Седан", 123, 5, true, new Car.Key(false, false));
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "Автомат", "Седан", 123, 5, true, new Car.Key(false, false));
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "Автомат", "Седан", 123, 5, true, new Car.Key(false, false));
        Car car5 = new Car("Hundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "Автомат", "Седан", 123, 5, true, new Car.Key(true, false));
        Car car6 = new Car("", "", 0, "", 0, "", "Автомат", "Седан", 123, 5, true, new Car.Key(false, false));
        Car car = new Car("", "", 0, "", 0, "", "Автомат", "Седан", 123, 5, true, new Car.Key(false, false));
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        System.out.println(car6.toString());
        car.changeRubberForSeason(12);
        System.out.println(car);
    }
    }



