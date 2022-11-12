package ru.geekbrains;

public class Cat {
    private String name;
    private int appetite; // сколько едениц еды кот потребляет за прием пищи
    private boolean isFull = true;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    // информация о состоянии кошки
    public void displayCat() {
        if (isFull) {
            System.out.println(name + " голодна и обычно потребляет " + appetite + " кусочков еды");
        } else {
            System.out.println(name + " удовлетворена, но обычно потребляет " + appetite + " кусочков еды");
        }
    }
    // метод который заставляет кота покушать
    public void eat(Plate plate) {
        if (plate.getFood() < appetite) {
            System.out.println("Недостаточно еды на тарелке для кошки " + name + "\n");
        } else {
            plate.decreaseFood(appetite);
            isFull = false;
            System.out.println("Кошка " + name + " насытилась!");
        }


    }

}
