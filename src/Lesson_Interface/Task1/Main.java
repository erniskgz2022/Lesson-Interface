package Lesson_Interface.Task1;

public class Main {
    public static void main(String[] args) {

        Swimable [] oceanariums = new Swimable[15];
        System.out.println("~~~~~~~~Shark~~~~~~~~~~");
        for (int i = 0; i < 5; i++) {
            oceanariums[i] = new Shark();
        }

        for (int i = 5; i < 10; i++) {
            oceanariums[i] = new Duck();
        }

        for (int i = 10; i < 15; i++) {
            oceanariums[i] = new Turtle();
        }

        for (Swimable Animal : oceanariums) {
            Animal.swim();
        }
    }
}
