package decorator.old.crypto;

import decorator.old.NetworkStream;

public class CryptoNetworkStream extends NetworkStream {
    @Override
    public void seek(int position) {
        //额外的加密操作
        System.out.println("CryptoNetworkStream.seek:加密");
        super.seek(position);
    }

    @Override
    public void read(int number) {
        //额外的加密操作
        System.out.println("CryptoNetworkStream.read:加密");
        super.read(number);
    }

    @Override
    public void write(char data) {
        //额外的加密操作
        System.out.println("CryptoNetworkStream.write:加密");
        super.write(data);
    }
}
