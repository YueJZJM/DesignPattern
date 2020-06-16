package builder.old;

public abstract class House {
    public void bulid() {

        step1();
        if (step2()) {
            step3();
        }
        step4();
    }

    public abstract void step1();

    public abstract boolean step2();

    public abstract void step3();

    public abstract void step4();
}
