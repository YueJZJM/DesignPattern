package decorator.new1.crypto;

import decorator.new1.IStream;

public class CryptoStream implements IStream {

    private IStream mIStream;

    public CryptoStream(IStream stream) {
        this.mIStream = stream;
    }

    public void read(int number) {
        //额外的加密操作
        System.out.println("加密");
        mIStream.read(number);
    }

    public void seek(int position) {
        //额外的加密操作
        System.out.println("加密");
        mIStream.seek(position);
    }

    public void write(char data) {
        //额外的加密操作
        System.out.println("加密");
        mIStream.write(data);
    }
}
