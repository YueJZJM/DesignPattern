package factorymethod.new1.factory;

import factorymethod.new1.ISplitter;
import factorymethod.new1.SplitterFactory;
import factorymethod.new1.imp.PictureSplitter;

public class PictureSplitterFactory implements SplitterFactory {
    public ISplitter createSplitter() {
        return new PictureSplitter();
    }
}
