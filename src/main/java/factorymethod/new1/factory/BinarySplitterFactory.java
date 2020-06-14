package factorymethod.new1.factory;

import factorymethod.new1.ISplitter;
import factorymethod.new1.SplitterFactory;
import factorymethod.new1.imp.BinarySplitter;

public class BinarySplitterFactory implements SplitterFactory {
    public ISplitter createSplitter() {
        return new BinarySplitter();
    }
}
