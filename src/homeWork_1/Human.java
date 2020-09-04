package homeWork_1;

public class Human implements Actions {

    private int maxRun;
    private int maxJump;

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек побежал");
    }
}
