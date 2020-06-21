package adapter;

//将 IAdaptee 转为 ITarget
public class Adapter implements ITarget {

    private IAdaptee mIAdaptee;

    public Adapter(IAdaptee adaptee) {
        this.mIAdaptee = adaptee;
    }

    public void process() {
        int data = mIAdaptee.bar();
        mIAdaptee.foo(data);
    }
}
