package decorator.new1;

import decorator.new1.crypto.CryptoStream;

public class Main {
    public static void main(String[] args) {
        FileStream fileStream = new FileStream();
        CryptoStream cryptoStream = new CryptoStream(fileStream);
        cryptoStream.read(111);
    }
}
