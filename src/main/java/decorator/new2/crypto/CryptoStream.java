package decorator.new2.crypto;

import decorator.new2.IStream;

public class CryptoStream extends DecoratorStream {

    public CryptoStream(IStream stream) {
        super(stream);
    }

    @Override
    public void write(char data) {
        // 加密操作
        super.write(data);
    }

    @Override
    public void read(int number) {
        //加密操作
        super.read(number);
    }

    @Override
    public void seek(int position) {
        //加密操作
        super.seek(position);
    }
}
