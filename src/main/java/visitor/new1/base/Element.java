package visitor.new1.base;

public interface Element {
    void accept(Visitor visitor);  //第一次多态辨析
}
