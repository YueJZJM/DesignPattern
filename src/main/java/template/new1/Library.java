package template.new1;

public abstract class Library {
    public void step1(){
        System.out.println("step1");
    }

    public void step3(){
        System.out.println("step3");
    }

    public void step5(){
        System.out.println("step5");
    }

    protected abstract boolean step2();

    protected abstract void step4();

    public void run() {
        step1();
        if (step2()) {
            step3();
        }
        step4();
        step5();
    }
}
