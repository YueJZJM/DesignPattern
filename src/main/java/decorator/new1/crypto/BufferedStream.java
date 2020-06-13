package decorator.new1.crypto;

import decorator.new1.IStream;

public class BufferedStream implements IStream {

    private IStream mIStream;

    public BufferedStream(IStream stream) {
        this.mIStream = stream;
    }

    public void read(int number) {
        //缓存操作
        System.out.println("缓存：read");
        mIStream.read(number);
    }

    public void seek(int position) {
        //缓存操作
        System.out.println("缓存：seek");
        mIStream.read(position);
    }

    public void write(char data) {
        //缓存操作
        System.out.println("缓存：write");
        mIStream.read(data);
    }
}
