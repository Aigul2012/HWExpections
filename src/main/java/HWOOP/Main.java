package HWOOP;

public class Main {
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Big car", 290, 101, 100, 234);
        Sedan sedan3 = new Sedan("Blue Rocket 10", 20, 76, 245, 300);
        Sedan sedan4 = new Sedan("Camry", 540, 98, 90, 659);
        Minivan minivan2 = new Minivan("Minivan 2000", 150, 101, 200, 250);
        Crossover crossover3 = new Crossover("X-Ray 220", 400, 130, 220, 350);
        Crossover crossover4 = new Crossover("Rav 4", 235, 100, 256, 456);

        // метод по заполнению магазина машинами
        System.out.println("Следующие машины есть в наличии: ");
        Shop shop = new Shop();

        try {
            System.out.println("Машина #1: ");
            shop.addCar(sedan1);
            System.out.println("Машина #2: ");
            shop.addCar(sedan4);
            System.out.println("Машина #3: ");
            shop.addCar(minivan2);
            System.out.println("Машина #4: ");
            shop.addCar(crossover3);
            System.out.println("Машина #5: ");
            shop.addCar(crossover4);
        } catch (checkedOutOfFreePlaceException e) {
            System.out.println("Магазин уже полный");
        } catch (uncheckedTooBigCarException n) {
            System.out.println("Слишком большая машина");
        }

//        shop.printCar();
//        System.out.println(" ");
//
//        // вывод стоймости всех имеющихся машин
//        System.out.println("Стоимости всех машин: ");
//        shop.showAllCarsPrice();
//        System.out.println(" ");
//
//        // продать машину (вывести что машина продана и убрать из магазина)
//        System.out.println("Список проданных машин: ");
//        shop.sellCar(sedan1);
//        System.out.println(" ");
//
//        System.out.println("Оставшиеся машины: ");
//        shop.printCar();
    }
}
