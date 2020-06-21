package adapter;

public class Main {
    public static void main(String arge[]) {

        //拿到了一个旧的类，但用新的类的接口去实现
        IAdaptee adaptee = new OldClass();
        ITarget target = new Adapter(adaptee);
        target.process();

    }
}
