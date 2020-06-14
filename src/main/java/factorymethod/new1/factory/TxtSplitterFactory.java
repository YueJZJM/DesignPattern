package factorymethod.new1.factory;

import factorymethod.new1.ISplitter;
import factorymethod.new1.SplitterFactory;
import factorymethod.new1.imp.TxtSplitter;

public class TxtSplitterFactory implements SplitterFactory {
    public ISplitter createSplitter() {
        return new TxtSplitter();
    }
}
