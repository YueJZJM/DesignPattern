package factory_method.new1.factory;

import factory_method.new1.ISplitter;
import factory_method.new1.SplitterFactory;
import factory_method.new1.imp.BinarySplitter;

public class BinarySplitterFactory implements SplitterFactory {
    public ISplitter createSplitter() {
        return new BinarySplitter();
    }
}
