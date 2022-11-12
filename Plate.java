package ru.geekbrains;

public class Plate {

    private int food;
    private final int capacity;

    public int getFood() {
        return food;
    }

    public Plate(int food, int capacity) {
        this.food = food;
         this.capacity = capacity;
     }
     // метод который умньшает кол-во едениц еды
    public void decreaseFood(int n){
        food -= n;
    }
    // выводит информацию о состоянии тарелки
    public void infoPlate() {
        System.out.println("Сейчас в тарелке : " + food + " кусочков еды\n");
    }

    // метод который добавляет кол-во едениц еды
    public void refillFood(int addFood) {
        if (addFood < 0) {
            System.out.println("Кусочков еды не может быть меньше 0");
        } else if (food + addFood > capacity){
            System.out.println("Неправильное значение, емкость тарелки равна " + capacity + " кусочков еды");
        } else {
            this.food = food + addFood;
            System.out.println("Тарелка была снова наполнена, теперь в ней есть " + food + " кусочков еды\n");
        }
    }
}
