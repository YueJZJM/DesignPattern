package decorator.old;

public class FileStream implements IStream {
    public void read(int number) {
        System.out.println("FileStream.read:" + number);
    }

    public void seek(int position) {
        System.out.println("FileStream.seek:" + position);
    }

    public void write(char data) {
        System.out.println("FileStream.write:" + data);
    }
}
