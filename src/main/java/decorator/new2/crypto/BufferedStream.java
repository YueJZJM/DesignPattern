package decorator.new2.crypto;

import decorator.new2.IStream;

public class BufferedStream extends DecoratorStream {

    public BufferedStream(IStream stream) {
        super(stream);
    }

    @Override
    public void write(char data) {
        //缓存操作
        super.write(data);
    }

    @Override
    public void read(int number) {
        //缓存操作
        super.read(number);
    }

    @Override
    public void seek(int position) {
        //缓存操作
        super.seek(position);
    }
}
