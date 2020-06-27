package visitor.new1.element;

import visitor.new1.base.Element;
import visitor.new1.base.Visitor;

public class ElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
}
