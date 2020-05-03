package HWOOP;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Car> listOfCars = new ArrayList<Car>();

    public void addCar(Car car) throws checkedOutOfFreePlaceException {
        if (car.height>100) {
            throw new uncheckedTooBigCarException();
        }
        if (listOfCars.size() >= 3){
            throw new checkedOutOfFreePlaceException();
        }
    }

    public void printCar() {
        for (Car car : listOfCars){
            System.out.println(car);
        }
    }

    public void showAllCarsPrice() {
        for (Car car : listOfCars){
            System.out.println("Модель: " + car.getCarModel() + " Цена: " + car.getPrice() );
        }
    }

    public void sellCar(Car car) {
        listOfCars.remove(car);
        System.out.println(car);
        }
    }
