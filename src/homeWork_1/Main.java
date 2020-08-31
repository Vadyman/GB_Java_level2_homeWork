package homeWork_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Actions[] runners = new Actions[3];


        for (int i = 0; i < runners.length; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    runners[i] = new Human();
                    break;
                case 1:
                    runners[i] = new Cat();
                    break;
                case 2:
                    runners[i] = new Robot();
                    break;
            }


        }


    }
}
