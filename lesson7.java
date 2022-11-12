package ru.geekbrains;

public class lesson7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Василиса", 10);
        Cat cat1 = new Cat("Маруся", 5);
        Plate plate = new Plate(5, 100);
        plate.infoPlate();
        cat.displayCat();
        cat.eat(plate);

        cat1.displayCat();
        cat1.eat(plate);
        plate.infoPlate();
        plate.refillFood(100);

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Снежка", 20);
        cats[1] = new Cat("Люся", 15);
        cats[2] = new Cat("Кнопа", 70);
        cats[3] = new Cat("Джесси", 25);

        for (Cat cati : cats) {
            cati.displayCat();
            cati.eat(plate);
            plate.infoPlate();

        }
    }
}
