package visitor.new1.visitor;

import visitor.new1.base.Element;
import visitor.new1.base.Visitor;

public class Visitor2 implements Visitor {
    public void visitElementA(Element element) {
        System.out.println("Visitor2:visitElementA");
    }

    public void visitElementB(Element element) {
        System.out.println("Visitor2:visitElementB");
    }
}
