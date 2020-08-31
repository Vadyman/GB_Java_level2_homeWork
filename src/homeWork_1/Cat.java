package homeWork_1;

public class Cat implements Actions {

    private int maxRun;
    private int maxJump;


    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }
}
