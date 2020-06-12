package decorator.old.crypto;

import decorator.old.MemoryStream;

public class CryptoMemoryStream extends MemoryStream {
    @Override
    public void write(char data) {
        //额外的加密操作
        System.out.println("CryptoMemoryStream.write:加密");
        super.write(data);
    }

    @Override
    public void read(int number) {
        //额外的加密操作
        System.out.println("CryptoMemoryStream.read:加密");
        super.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作
        System.out.println("CryptoMemoryStream.seek:加密");
        super.seek(position);
    }
}
