package builder.new1.base;

public abstract class HouseBuilder {
    House mHouse;

    House getResult() {
        return mHouse;
    }

    public abstract void step1();

    public abstract boolean step2();

    public abstract void step3();

    public abstract void step4();

}
