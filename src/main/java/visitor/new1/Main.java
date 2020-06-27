package visitor.new1;

import visitor.new1.base.Element;
import visitor.new1.base.Visitor;
import visitor.new1.element.ElementB;
import visitor.new1.visitor.Visitor2;

public class Main {
    public static void main(String args[]) {
        Visitor visitor2 = new Visitor2();
        Element elementB = new ElementB();
        elementB.accept(visitor2);
    }
}
