package Lesson_Interface.Task2;

public class Main {
    public static void main(String[] args) {
        Baked [] bakeds = {new Bread(), new Bun(), new Cupcake(), new Pie()};

        for (Baked product : bakeds) {
            product.bake();
        }
    }
}
