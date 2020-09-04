package homeWork_1;

public class Robot implements Actions {

    private int maxRun;
    private int maxJump;


    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот побежал");
    }
}
