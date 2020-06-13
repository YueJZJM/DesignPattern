package decorator.new2.crypto;

import decorator.new2.IStream;

public class DecoratorStream implements IStream {

    IStream mIStream;

    public DecoratorStream(IStream stream) {
        this.mIStream = stream;
    }

    public void read(int number) {
        mIStream.read(number);
    }

    public void seek(int position) {
        mIStream.seek(position);
    }

    public void write(char data) {
        mIStream.write(data);
    }
}
