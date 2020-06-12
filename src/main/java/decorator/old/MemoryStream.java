package decorator.old;

public class MemoryStream implements IStream {
    public void read(int number) {
        System.out.println("MemoryStream.read:" + number);
    }

    public void seek(int position) {
        System.out.println("MemoryStream.seek:" + position);
    }

    public void write(char data) {
        System.out.println("MemoryStream.write:" + data);
    }
}
