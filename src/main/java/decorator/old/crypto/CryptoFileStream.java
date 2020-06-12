package decorator.old.crypto;

import decorator.old.FileStream;

public class CryptoFileStream extends FileStream {

    @Override
    public void read(int number) {
        //额外的加密操作
        System.out.println("CryptoFileStream.read:加密");
        super.read(number);
    }

    @Override
    public void write(char data) {
        //额外的加密操作
        System.out.println("CryptoFileStream.write:加密");
        super.write(data);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作
        System.out.println("CryptoFileStream.seek:加密");
        super.seek(position);
    }
}
